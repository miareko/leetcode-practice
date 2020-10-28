package me.dddew.leetcode.p1207;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author miareko
 * @date 2020-10-28
 */
public class Solution {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> buckets = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            Integer c = buckets.getOrDefault(arr[i], 0);
            buckets.put(arr[i], c + 1);
        }
        Set<Integer> counter = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry : buckets.entrySet()) {
            counter.add(entry.getValue());
        }
        return buckets.size() == counter.size();
    }
}
