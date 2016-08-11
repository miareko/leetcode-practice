package me.dddew.leetcode.p003;


public class Solution {
	
	/**
	 * 从左往右扫描，假设当前字符是最长不重复子串的最后一个字符，取最大值。
	 */
	public int lengthOfLongestSubstring(String s) {
		
		if(s == null) {
			return 0;
		}
		
		int[] lastIndex = new int[256]; // 字符最后一次出现的位置
		int ans = 0;
		for(int i = 0, lastPos = 0; i < s.length(); i++) {
			lastPos = Math.max(lastIndex[s.charAt(i)], lastPos);
			ans = Math.max(ans, i - lastPos + 1);
			lastIndex[s.charAt(i)] = i+1;
		}
		
		return ans;
	}

	/**
	 * 从左往右扫描，当遇到重复字母时，以上一个重复字母的index+1，作为新的搜索起始位置
	 */
	public int lengthOfLongestSubstring2(String s) {
        
		int length = 0;
		
		if(s != null) {
			int from = 0;
			for(int i = 0; i < s.length(); i++) {
				
				for(int j = from; j <= i - 1; j++) {
					
					if(s.charAt(i) == s.charAt(j)) {
						length = Math.max(i - from, length);
						from = j + 1;
					}
				}
				
				if(i == s.length() - 1) {
					length = Math.max(i + 1 - from, length);
				}
			}
		}
		
		return length;
    }
	
}
