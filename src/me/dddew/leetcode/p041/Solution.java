package me.dddew.leetcode.p041;

import java.util.BitSet;

/**
 * @author miareko
 * @date 2020-10-17
 */
public class Solution {
    public int totalNQueens(int n) {
        if (n == 0) {
            return 0;
        }
        BitSet col = new BitSet(n);
        BitSet left = new BitSet(2 * n);
        BitSet right = new BitSet(2 * n);
        return dfs(0, n, 0, col, left, right);
    }

    int dfs(int i, int n, int ans, BitSet col, BitSet left, BitSet right) {
        if (i == n) {
            ans++;
            return ans;
        }
        for (int j = 0; j < n; j++) {
            int x = j + 1;
            int y = i + j + 1;
            int z = i >= j ? 2 * (i - j) + 1 : 2 * (j - i) + 2;
            if (!col.get(x) && !left.get(y) && !right.get(z)) {
                col.set(x);
                left.set(y);
                right.set(z);
                ans = dfs(i + 1, n, ans, col, left, right);
                col.clear(x);
                left.clear(y);
                right.clear(z);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().totalNQueens(4));
    }
}
