package me.dddew.leetcode.p027;

public class Solution {

    public int removeElement(int[] nums, int val) {

        int result = nums.length;

        if(nums != null && nums.length > 0) {

            int left = 0;
            int right = nums.length - 1;

            while(left <= right) {
                while(left <= right && nums[left] != val) left++;
                while(left <= right && nums[right] == val) {
                    right--;
                    result--;
                }

                if(left <= right) {
                    nums[left++] = nums[right--];
                    result--;
                }
            }
        }
        return result;
    }

}
