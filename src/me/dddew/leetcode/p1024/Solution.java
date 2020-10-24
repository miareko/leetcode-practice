package me.dddew.leetcode.p1024;

/**
 * @author miareko
 * @date 2020-10-24
 */
public class Solution {

    public int videoStitching(int[][] clips, int T) {
        int[] end = new int[100];
        for (int i = 0; i < clips.length; i++) {
            end[clips[i][0]] = Math.max(clips[i][1], end[clips[i][0]]);
        }
        int t = 0;
        int i = 0;
        int c = 0;
        while (t < T && i < T) {
            int e = t;
            while (i <= e) {
                if (end[i] > e) {
                    t = end[i];
                }
                i++;
            }
            if (t == e) {
                return -1;
            }
            c++;
        }
        return c;
    }

    public static void main(String[] args) {
        int[][] clips = new int[][]{
                new int[]{0,2},new int[]{4,6},new int[]{8,10},
                new int[]{1,9},new int[]{1,5},new int[]{5,9}
        };
        System.out.println(new Solution().videoStitching(clips, 10));
    }
}
