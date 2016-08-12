package me.dddew.leetcode.p005;

/**
 * created by fanlu on 08/11/2016
 */
public class Solution {

    public String longestPalindrome(String s) {
        
    	if(s == null) {
    		return null;
    	}
    	
    	int[] from = new int[1000];
    	from[0] = 0;
    	int maxIndex = 0;
    	int maxLenth = 1;
    	for(int i = 1; i < s.length(); i++) {
    		
    		for(int j = from[i-1] - 1; j <= i; j++) {
    			
    			if(j >= 0 && isPalindrome(s, j, i)) {
    				from[i] = j;
    				
    				if(i - j + 1 > maxLenth) {
    					maxIndex = i;
    					maxLenth = i - j + 1;
    				}
    				break;
    			}
    		}
    	}
    	return s.substring(from[maxIndex], maxIndex + 1);
    }
    
    public boolean isPalindrome(String s, int from, int till) {
    	
    	for(int i = from, j = till; i <= j; i++, j--) {
    		
    		if(s.charAt(i) != s.charAt(j)) {
    			return false;
    		}
    	}
    	return true;
    }
    

    /**
     * DP 
     */
    public String longestPalindrome2(String s) {
        
    	if(s == null) {
    		return null;
    	}
    	
    	boolean[][] p = new boolean[1000][1000];
    	
    	int from = 0;
    	int till = 0;
    	for(int i = 0; i < s.length(); i++) {
    		p[i][i] = true;
    		
    		if(i < s.length() - 1 && s.charAt(i) == s.charAt(i+1)) {
    			p[i][i+1] = true;
    			from = i;
    			till = i+1;
    		}
    	}
    	for(int i = 2; i <= s.length(); i++) {
    		
    		for(int j = 0; j < s.length() && j+i-1 < s.length(); j++) {
    			
    			if(p[j+1][j+i-2] && s.charAt(j) == s.charAt(j+i-1)) {
    				p[j][j+i-1] = true;
    				from = j;
    				till = j+i-1;
    			}
    		}
    	}
    	
    	return s.substring(from, till + 1);
    }
}
