package me.dddew.leetcode.p017;

import java.util.ArrayList;
import java.util.List;

public class AnotherSolution {

    private static char[][] digitChars = new char[8][];

    static {
        digitChars[0] = new char[] {'a', 'b', 'c'};
        digitChars[1] = new char[] {'d', 'e', 'f'};
        digitChars[2] = new char[]{'g', 'h', 'i'};
        digitChars[3] = new char[]{'j', 'k', 'l'};
        digitChars[4] = new char[]{'m', 'n', 'o'};
        digitChars[5] = new char[]{'p', 'q', 'r', 's'};
        digitChars[6] = new char[]{'t', 'u', 'v'};
        digitChars[7] = new char[]{'w', 'x', 'y', 'z'};
    }


    public List<String> letterCombinations(String digits) {
        
    	List<String> list = new ArrayList<String>();
    	
    	int length = digits.length();
    	int[] index = new int[length];
    	
    	int k = length - 1;
    	while(k >= 0) {
    		char[] tmp = new char[length];
    		for(int i = 0; i < length; i++) {
    			if(digits.charAt(i) >= '2' && digits.charAt(i) <= '9') {
    				tmp[i] = digitChars[digits.charAt(i) - '2'][index[i]];
    			}
    		}
    		list.add(new String(tmp));
    		
    		k = length - 1;
    		while(k >= 0) {
    			
    			if(digits.charAt(k) >= '2' && digits.charAt(k) <= '9' && index[k] < digitChars[digits.charAt(k) - '2'].length - 1) {
    				index[k]++;
    				break;
    			} else {
    				index[k] = 0;
    				k--;
    			}
    		}
    	}
    	return list;
    }
    
}
