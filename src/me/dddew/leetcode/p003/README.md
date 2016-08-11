## Longest Substring Without Repeating Characters

[https://leetcode.com/problems/longest-substring-without-repeating-characters/](https://leetcode.com/problems/longest-substring-without-repeating-characters/)

Given a string, find the length of the longest substring without repeating characters.

**Examples:**

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

<br>

### 解题思路

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;从左往右扫描，记录当前字符出现的位置，作为之后扫描到相同字符的上一次出现位置，那么以当前位置结尾的最长不重复子串是**上一次当前出现位置的后一位到当前位置**或者**上一层循环结果的开始位置到当前位置**。扫描完成后取所有结果的最大值。