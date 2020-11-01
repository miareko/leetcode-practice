package me.dddew.leetcode.p033;

/**
 * @author miareko
 * @date 2020-06-12
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(search(new int[]{4,5,6,7,0,1,2}, 0));
    }

    public static int search(int[] nums, int target) {
        int len = nums.length, l = 0, r = len - 1, pos = 0;
        if (len > 0) {
            while (l <= r) {
                pos = (l + r) >> 1;
                if (nums[pos] <= nums[Math.max(pos - 1, 0)] && nums[pos] <= nums[len - 1]) {
                    break;
                }
                if (nums[pos] > nums[len - 1]) {
                    l = pos + 1;
                } else {
                    r = pos - 1;
                }
            }

            if (nums[len - 1] < target) {
                l = 0;
                r = pos;
            } else {
                l = pos;
                r = len - 1;
            }

            while (l <= r) {
                pos = (l + r) >> 1;
                if (nums[pos] == target) {
                    return pos;
                }
                if (nums[pos] > target) {
                    r = pos - 1;
                } else {
                    l = pos + 1;
                }
            }
        }
        return -1;
    }
}
