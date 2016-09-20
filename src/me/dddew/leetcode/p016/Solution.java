package me.dddew.leetcode.p016;

import java.util.Arrays;

public class Solution {

    public int threeSumClosest(int[] nums, int target) {

        if(nums == null || nums.length < 3) {
            return 0;
        }

        Arrays.sort(nums);

        int diffs = Integer.MAX_VALUE;

        for(int i = 0 ; i < nums.length - 2; i++) {

            int left = i+1;
            int right = nums.length - 1;
            int sum = target - nums[i];

            boolean skiped = false;

            while(left < right) {

                if(nums[left] + nums[right] == sum) {
                    return target;
                }

                skiped = false;
                while(nums[left] + nums[right] > sum && left < right) {
                    skiped = true;
                    right--;
                }

                if(skiped && nums[left] + nums[right+1] - sum < Math.abs(diffs)) {
                    diffs = nums[left] + nums[right+1] - sum;
                }

                skiped = false;
                while(nums[left] + nums[right] < sum && left < right) {
                    skiped = true;
                    left++;
                }

                if(skiped && sum - nums[left-1] - nums[right] < Math.abs(diffs)) {
                    diffs = nums[left-1] + nums[right] - sum;
                }
            }
        }

        return target + diffs;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
    }

}
