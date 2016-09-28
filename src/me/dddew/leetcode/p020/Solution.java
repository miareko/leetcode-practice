package me.dddew.leetcode.p020;


public class Solution {
    
	public boolean isValid(String s) {
		
		int length = s.length();
		char[] lefts = new char[length];
		char[] brackets = s.toCharArray();
		
		int leftIndex = 0;
		for(int i = 0; i < brackets.length; i++) {
			
			if(brackets[i] == '(' || brackets[i] == '{' || brackets[i] == '[') {
				lefts[leftIndex++] = brackets[i];
			} else if(leftIndex == 0) {
				return false;
			} else if(brackets[i] == ')') {
				
				if(lefts[--leftIndex] != '(') {
					return false;
				}
			} else if(brackets[i] == '}') {
				
				if(lefts[--leftIndex] != '{') {
					return false;
				}
			} else if(brackets[i] == ']') {
				
				if(lefts[--leftIndex] != '[') {
					return false;
				}
			}
		}
		return leftIndex == 0;
    }

}
