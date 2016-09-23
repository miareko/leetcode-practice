package me.dddew.leetcode.p026;

public class Solution {

    public int removeDuplicates(int[] nums) {

        int result = 0;

        if(nums != null && nums.length > 0) {
            int num = nums[0];
            result++;

            for(int i = 1; i < nums.length; i++) {

                if(nums[i] != num) {
                    nums[result] = nums[i];
                    result++;
                    num = nums[i];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2,3,4,4,4};
        System.out.println(new Solution().removeDuplicates(nums));
    }
}
