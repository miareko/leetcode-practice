package me.dddew.leetcode.p139;

import java.util.List;

/**
 * @author miareko
 * @date 2020-11-01
 */
public class Solution {

    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()];
        for (String word : wordDict) {
            if (s.startsWith(word)) {
                dp[word.length() - 1] = true;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (dp[i]) {
                continue;
            }
            String pre = s.substring(0, i + 1);
            for (String word : wordDict) {
                if (pre.endsWith(word) && dp[i - word.length()]) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length() - 1];
    }
}
