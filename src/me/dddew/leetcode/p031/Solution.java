package me.dddew.leetcode.p031;

/**
 * @author miareko
 * @date 2020-06-10
 */
public class Solution {

    public void nextPermutation(int[] nums) {
        int len = nums.length;
        int tmp;
        for (int i = len - 2; i >= 0; i--) {
            if (nums[i] < nums[i+1]) {
                int j = i+1;
                while (++j < len && nums[i] < nums[j]) {}
                tmp = nums[j-1];
                nums[j-1] = nums[i];
                nums[i] = tmp;
                for (int k = i+1; k < (len+i+1)/2; k++) {
                    tmp = nums[k];
                    nums[k] = nums[len+i-k];
                    nums[len+i-k] = tmp;
                }
                return;
            }
        }
        for (int i = 0; i < len/2; i++) {
            tmp = nums[i];
            nums[i] = nums[len-i-1];
            nums[len-i-1] = tmp;
        }
    }
}
