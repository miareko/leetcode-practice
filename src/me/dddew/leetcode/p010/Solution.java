package me.dddew.leetcode.p010;

public class Solution {

    public boolean isMatch(String s, String p) {
    	
    	if(s == null || p == null) {
    		return false;
    	}
    	
    	boolean[][] dp = new boolean[s.length()+1][p.length()+1];
    	
    	dp[0][0] = true;
    	
    	for(int i = 2 ; i <= p.length(); i+=2) {
    		dp[0][i] = dp[0][i-2] && p.charAt(i-1) == '*';
    		
    		if(!dp[0][i]) {
    			break;
    		}
    	}
    	
    	for(int i = 0; i < s.length(); i++) {
    		
    		for(int j = 0; j < p.length(); j++) {
    			
    			if(p.charAt(j) == '*') {
    				
    				if(p.charAt(j-1) == '.') {
    					for(int k = i; k+1 >= 0; k--) {
    						
    						if(dp[k+1][j-1]) {
    							dp[i+1][j+1] = true;
    							break;
    						}
    					}
    				} else {
    					
    					for(int k = i; k+1 >= 0; k--) {
    						
    						if(dp[k+1][j-1]) {
    							dp[i+1][j+1] = true;
    							break;
    						} else if(k >= 0 && p.charAt(j-1) == s.charAt(k)) {
    							continue;
    						}
    						break;
    					}
    				}
    				
    			} else {
    				dp[i+1][j+1] = dp[i][j] && (p.charAt(j) == s.charAt(i) || p.charAt(j) == '.');
    			}
    			
    		}
    		
    	}
    	
    	return dp[s.length()][p.length()];
    }
    
    public static void main(String[] args) {
		System.out.println(new Solution().isMatch("a", ".*..a*"));
	}

}
