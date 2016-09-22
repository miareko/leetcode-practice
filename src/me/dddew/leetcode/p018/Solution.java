package me.dddew.leetcode.p018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> results = new ArrayList<>();

        if(nums != null && nums.length >= 4 ) {

            Arrays.sort(nums);
            for(int i = 0; i < nums.length - 3; i++) {

                if(i > 0 && nums[i] == nums[i-1]) continue;

                for(int j = i+1; j < nums.length - 2; j++) {

                    if(j > i+1 && nums[j] == nums[j-1]) continue;

                    int left = j+1;
                    int right = nums.length - 1;
                    int sum = nums[i] + nums[j];

                    while(left < right) {
                        while(left < right && nums[left] + nums[right] == target - sum) {
                            results.add(Arrays.asList(nums[i], nums[j], nums[left++], nums[right--]));
                            while(left < right && nums[left] == nums[left-1]) left++;
                            while(left < right && nums[right] == nums[right+1]) right--;
                        }

                        while(left < right && nums[left] + nums[right] > target - sum) right--;
                        while(left < right && nums[left] + nums[right] < target - sum) left++;

                    }
                }
            }
        }
        return results;
    }

    public static void main(String[] args) {
        new Solution().fourSum(new int[]{-3,-2,-1,0,0,1,2,3}, 0).forEach(System.out::println);
    }
}
