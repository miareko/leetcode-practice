package me.dddew.leetcode.p140;

import java.util.*;

/**
 * @author miareko
 * @date 2020-11-01
 */
public class Solution {

    public List<String> wordBreak(String s, List<String> wordDict) {
        if (!checkWordBreak(s, wordDict)) {
            return Collections.emptyList();
        }
        Map<Integer, Set<List<String>>> map = new HashMap<>();
        for (String word : wordDict) {
            if (!s.startsWith(word)) {
                continue;
            }
            Set<List<String>> set = new HashSet<>();
            List<String> parts = new ArrayList<>();
            parts.add(word);
            set.add(parts);
            map.put(word.length() - 1, set);
        }

        for (int i = 0; i < s.length(); i++) {
            String pre = s.substring(0, i + 1);
            for (String word : wordDict) {
                if (pre.endsWith(word)) {
                    int last = i - word.length();
                    if (last >= 0 && map.containsKey(last)) {
                        Set<List<String>> set = map.get(last);
                        if (!map.containsKey(i)) {
                            map.put(i, new HashSet<>());
                        }
                        for (List<String> list : set) {
                            List<String> parts = new ArrayList<>(list);
                            parts.add(word);
                            map.get(i).add(parts);
                        }
                    }
                }
            }
        }

        List<String> res = new ArrayList<>();
        if (map.containsKey(s.length() - 1)) {
            Set<List<String>> set = map.get(s.length() - 1);
            for (List<String> parts : set) {
                StringBuilder sb = new StringBuilder();
                for (String part : parts) {
                    sb.append(part).append(" ");
                }
                sb.deleteCharAt(sb.length() - 1);
                res.add(sb.toString());
            }
        }
        return res;
    }

    public boolean checkWordBreak(String s, List<String> wordDict) {
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

    public static void main(String[] args) {
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        List<String> wordDict = Arrays.asList(new String[]{"a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa"});
//        String s = "catsanddog";
//        List<String> wordDict = Arrays.asList(new String[]{"cat","cats","and","sand","dog"});
        System.out.println(new Solution().wordBreak(s, wordDict));
    }

}
