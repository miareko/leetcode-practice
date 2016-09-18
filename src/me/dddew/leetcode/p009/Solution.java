package me.dddew.leetcode.p009;

public class Solution {
    
	public boolean isPalindrome(int x) {
		
		if(x == 0) {
			return true;
		}
		
		if(x < 0) {
			return false;
		}
		
		int tmp = 0;
		int y = x;
		while(x > 0) {
			tmp = 10*tmp + x%10;
			x /= 10;
			
			if(x > 10 && x < 10 && tmp > 0 && (Integer.MAX_VALUE - x)/tmp < 10) {
				return false;
			}
		}
		return y == tmp;
    }

}
