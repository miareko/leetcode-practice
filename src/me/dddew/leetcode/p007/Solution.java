package me.dddew.leetcode.p007;

public class Solution {

    public int reverse(int x) {
    	
    	if(x == 0) {
    		return 0;
    	}
    	
    	int abs = 1;
    	if(x < 0) {
    		abs = -1;
    	}
    	x = Math.abs(x);
    	
    	int y = 0;
    	while(x > 0) {
    		y = y*10 + x%10;
    		x /= 10;
    		
    		if(x < 10 && x > 0 && y > 0 && (Integer.MAX_VALUE - x)/y < 10) {
    			return 0;
    		}
    	}
    	return abs * y;
    }
    
}
