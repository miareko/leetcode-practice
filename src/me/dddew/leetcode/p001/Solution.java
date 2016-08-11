package me.dddew.leetcode.p001;

import java.util.HashMap;
import java.util.Map;

public class Solution {

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
