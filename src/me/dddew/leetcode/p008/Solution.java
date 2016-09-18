package me.dddew.leetcode.p008;

public class Solution {
	
	public int myAtoi(String str) {
		
		int ans = 0;
		boolean positive = true;
		
		if(str != null && str.length() > 0) {
			int max = Integer.MAX_VALUE / 10;
			int min = -(Integer.MIN_VALUE / 10);
			int lastMax = Integer.MAX_VALUE % 10;
			int lastMin = -(Integer.MIN_VALUE % 10);
			
			char[] chars = str.trim().toCharArray();
			int i = 0;
			
			if(chars[i] == '-') {
				positive = false;
				i++;
			} else if(chars[i] == '+') {
				i++;
			}
			
			for(; i < chars.length; i++) {
				
				if(!isNumber(chars[i])) {
					break;
				} 

				int a = toNum(chars[i]);

				if(positive) {
					
					if(ans > max || (ans == max && a >= lastMax)) {
						return Integer.MAX_VALUE;
					} else if(ans == max) {
						return 10*max + a;
					} else {
						ans = 10*ans + a;
					}
				} else {
					
					if(ans > min || (ans == min && a >= lastMin)) {
						return Integer.MIN_VALUE;
					} else if(ans == min) {
						return -(10*min + a);
					} else {
						ans = 10*ans + a;
					}
				}
			}
		}
		
		return positive ? ans : -ans;
    }
	
	public boolean isNumber(char ch) {
		return ch >= '0' && ch <= '9';
	}
	
	public int toNum(char ch) {
		return ch - '0';
	}
	
}
