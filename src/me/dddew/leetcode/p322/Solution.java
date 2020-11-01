package me.dddew.leetcode.p322;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

/**
 * @author miareko
 * @date 2020-08-11
 */
public class Solution {

    public int dp(int[] coins, int amount) {
        if (coins == null || coins.length == 0 || amount < 0) {
            return -1;
        }

        int[] dp = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            dp[i] = -1;
        }
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                dp[coins[i]] = 1;
            }
        }

        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                int k = i - coins[j];
                if (k >= 0 && dp[k] >= 0) {
                    int c = dp[k] + 1;
                    if (dp[i] == -1) {
                        dp[i] = c;
                    } else {
                        dp[i] = Math.min(dp[i], c);
                    }
                }
            }
        }
        return dp[amount];
    }

    public int coinChange(int[] coins, int amount) {
        if (coins == null) return -1;
        Arrays.sort(coins);
        for (int i = 0; i < coins.length / 2; i++) {
            coins[i] ^= coins[coins.length - 1 - i];
            coins[coins.length - 1 - i] ^= coins[i];
            coins[i] ^= coins[coins.length - 1 - i];
        }
        return dfs(amount, coins, -1, 0, 0);
    }

    int dfs(int target, int[] coins, int ans, int c, int i) {
        if (c >= ans && ans != -1) {
            return ans;
        }
        if (target == 0) {
            ans = ans == -1 ? c : Math.min(ans, c);
            return ans;
        }
        if (i >= coins.length) {
            return ans;
        }
        int k = target / coins[i];
        for (int j = k; j >= 0; j--) {
            c += j;
            ans = dfs(target - j * coins[i], coins, ans, c, i + 1);
            c -= j;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().coinChange(new int[]{470,18,66,301,403,112,360}, 8235));
    }
}
