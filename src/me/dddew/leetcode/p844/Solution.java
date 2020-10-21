package me.dddew.leetcode.p844;

/**
 * @author miareko
 * @date 2020-10-19
 */
public class Solution {

    public boolean backspaceCompare(String S, String T) {
        String targetS = build(S);
        String targetT = build(T);
        return targetS.equals(targetT);
    }

    private String build(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch == '#') {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                continue;
            }
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().backspaceCompare("y#fo##f", "y#f#o##f"));
    }
}
