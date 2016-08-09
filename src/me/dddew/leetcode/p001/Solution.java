package me.dddew.leetcode.p001;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum 
 * @see <a href="https://leetcode.com/problems/two-sum/">https://leetcode.com/problems/two-sum/</a>
 * 
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution.
 * 
 * Example:
 * 
 * 	Given nums = [2, 7, 11, 15], target = 9,
 * 	Because nums[0] + nums[1] = 2 + 7 = 9,
 * 	return [0, 1].
 *
 * 	这道题比较简单，关键是要降低时间复杂度。
 */
public class Solution {

	/**
	 * 时间复杂度 O(n)，因为HashMap的时间复杂度为O(1)。
	 * 
	 * 还有一种时间复杂度O(nlogn)的算法，排序之后使用夹逼准则。
	 */
	public int[] twoSum(int[] nums, int target) {
        
		if(nums == null || nums.length < 2) {
			return null;
		}

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums.length; i++) {
			
			if(map.containsKey(target - nums[i])) {
				return new int[]{map.get(target - nums[i]), i};
			}
			map.put(nums[i], i);
		}
		return null;
    }
	
}
