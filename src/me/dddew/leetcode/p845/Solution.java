package me.dddew.leetcode.p845;

/**
 * @author miareko
 * @date 2020-10-25
 */
public class Solution {

    public int longestMountain(int[] A) {
        int len = A.length;
        int[] up = new int[len];
        int[] down = new int[len];
        int ans = 0;
        for (int i = 1; i < len; i++) {
            if (A[i] > A[i-1]) {
                up[i] = up[i-1] + 1;
            } else if (A[i] < A[i-1]) {
                down[i] = down[i-1] + 1;
                if (up[i-down[i]] > 0) {
                    ans = Math.max(down[i] + up[i-down[i]] + 1, ans);
                }
            }
        }
        return ans;
    }
}
