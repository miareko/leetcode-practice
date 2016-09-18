package me.dddew.leetcode.p015;

import java.util.*;

public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

        if(nums == null || nums.length < 3) {
            return new ArrayList<>();
        }

        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums);

        HashMap<Integer, Set> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                Set<Integer> set = new HashSet<>();
                set.add(i);
                map.put(nums[i], set);
            } else {
                map.get(nums[i]).add(i);
            }
        }

        for(int i = 0 ; i < nums.length -2; i++) {

            if(nums[i] > 0) {
                break;
            }

            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            for(int j = i+1; j < nums.length-1; j++) {

                int f = -nums[i] - nums[j];

                if(f < nums[i] || f < nums[j]) {
                    break;
                }

                if(j > i+1 && nums[j] == nums[j-1]) {
                    continue;
                }

                if(!map.containsKey(f)) {
                    continue;
                }

                if((f == nums[i] || f == nums[j]) && map.get(f).size() <= 1) {
                    continue;
                }

                if(f == nums[i] && f == nums[j] && map.get(f).size() <= 2) {
                    continue;
                }

                list.add(Arrays.asList(nums[i], nums[j], f));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}
