package me.dddew.leetcode.p925;

/**
 * @author miareko
 * @date 2020-10-21
 */
public class Solution {

    public boolean isLongPressedName(String name, String typed) {
        int i = name.length();
        int j = typed.length();
        if (i > j) {
            return false;
        }
        while (i > 0 && j > 0) {
            char ci = name.charAt(i - 1);
            char cj = typed.charAt(j - 1);
            if (ci != cj) {
                return false;
            }
            int x = 1, y = 1;
            i--;
            j--;
            while (i > 0 && name.charAt(i - 1) == ci) {
                x++;
                i--;
            }
            while (j > 0 && typed.charAt(j - 1) == cj) {
                y++;
                j--;
            }
            if (x > y) {
                return false;
            }
        }
        return i == 0 && j == 0;
    }
}
