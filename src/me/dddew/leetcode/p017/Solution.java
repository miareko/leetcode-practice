package me.dddew.leetcode.p017;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private static char[][] digitChars = new char[8][];

    static {
        digitChars[0] = new char[] {'a', 'b', 'c'};
        digitChars[1] = new char[] {'d', 'e', 'f'};
        digitChars[2] = new char[]{'g', 'h', 'i'};
        digitChars[3] = new char[]{'j', 'k', 'l'};
        digitChars[4] = new char[]{'m', 'n', 'o'};
        digitChars[5] = new char[]{'p', 'q', 'r', 's'};
        digitChars[6] = new char[]{'t', 'u', 'v'};
        digitChars[7] = new char[]{'w', 'x', 'y', 'z'};
    }

    public List<String> letterCombinations(String digits) {

        int length = digits.length();
        List<String> list = new ArrayList<>();

        if(length > 0) {
            dfs(list, digits.toCharArray(), new char[length], 0, digits.length());
        }
        return list;
    }

    private void dfs(List<String> list, char[] digits, char[] comb, int depth, int length) {

        if(depth == length) {
            list.add(new String(comb));
            return;
        }

        char[] chars = digitChars[digits[depth] - '2'];

        for (int i = 0; i < chars.length; i++) {
            comb[depth] = chars[i];
            dfs(list, digits, comb, depth+1, length);
        }
    }
}
