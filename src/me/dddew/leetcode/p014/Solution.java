package me.dddew.leetcode.p014;

public class Solution {

    public String longestCommonPrefix(String[] strs) {

        if(strs == null || strs.length == 0) {
            return "";
        }

        if(strs.length == 1) {
            return strs[0];
        }

        StringBuilder prefix = new StringBuilder();

        int index = 0;

        boolean goon = true;
        while(goon) {

            if(strs[0].length() <= index) {
                break;
            }
            for(int i = 1; i < strs.length; i++) {
                if(strs[i].length() <= index || strs[i].charAt(index) != strs[0].charAt(index)) {
                    goon = false;
                    break;
                }
            }

            if(goon) {
                prefix.append(strs[0].charAt(index));
                index++;
            }
        }
        return prefix.toString();
    }
}
