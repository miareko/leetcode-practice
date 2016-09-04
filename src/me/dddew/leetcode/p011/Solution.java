package me.dddew.leetcode.p011;

/**
 * Created by admin on 2016/9/2.
 */
public class Solution {

    public int maxArea(int[] height) {

        if(height == null || height.length < 2) {
            return 0;
        }

        int left = 0;
        int right = height.length - 1;
        int area = 0;

        while(left < right) {

            if(height[left] < height[right]) {
                area = Math.max(area, height[left] * (right - left));
                left++;
            } else if(height[left] > height[right]) {
                area = Math.max(area, height[right] * (right - left));
                right--;
            } else {
                area = Math.max(area, height[left] * (right - left));
                left++;
                right--;
            }
        }
        return area;

    }

    public static void main(String[] args) {
        int[] height = new int[15000];
        for(int i = 0; i < height.length; i++) {
            height[i] = 15000 - i;
        }
        System.out.println(new Solution().maxArea(height));
    }
}
