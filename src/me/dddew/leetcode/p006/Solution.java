package me.dddew.leetcode.p006;

/**
 * created by fanlu on 08/11/2016
 */
public class Solution {
	
    public String convert(String s, int numRows) {
        
    	if(numRows == 1) {
    		return s;
    	}
    	
    	if(s == null) {
    		return null;
    	}
    	
    	int delta = 2*numRows - 2;
    	int n = s.length();
    	StringBuilder sb = new StringBuilder();
    	for(int i = 1, j = 0; i <= numRows; i++) {
    		
    		if(i == 1 || i == numRows) {
    			j = 0;
    			while(i + j*delta <= n) {
    				sb.append(s.charAt(i+j*delta - 1));
    				j++;
    			}
    		} else {
    			j = 0;
    			while(i + delta*j <= n) {
    				sb.append(s.charAt(i+j*delta - 1));
    				
    				if(delta*j + 2*numRows - i <= n) {
    					sb.append(s.charAt(delta*j + 2*numRows - i - 1));
    				}
    				j++;
    			}
    		}
    	}
    	return sb.toString();
    }
    
    public static void main(String[] args) {
		System.out.println(new Solution().convert("PAYPALISHIRING", 2));
	}

}
