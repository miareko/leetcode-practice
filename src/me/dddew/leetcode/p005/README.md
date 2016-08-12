## Longest Palindromic Substring

[https://leetcode.com/problems/longest-palindromic-substring/](https://leetcode.com/problems/longest-palindromic-substring/)

Given a string S, find the longest palindromic substring in S. You may assume that the maximum length of S is 1000, and there exists one unique longest palindromic substring.

<br>

### 解题思路

第一种：动态规划

定义P[i][j]如下：

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;当S[i]到S[j]的子串是回文时，P[i][j]为true；否则为false。那么P[i][j]={P[i-1][j-1] && S[i]==s[j]}。而：P[i][i]=true、P[i][i+1]={S[i]==S[i+1]}，所以能够得到一种时间复杂度O(n)和空间复杂度O(n)的解法。

<br>

第二种：

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;从左往右扫描，记录以当前字符结尾的最长回文串的开始位置，而这个位置可以由以上一个字符结尾的最长回文串的开始位置得到：

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;令i为当前位置，P[i]为以当前字符结尾的最长回文串的开始位置，那么P[i-1]-1 <= P[i] <= i（如果P[i]<P[i-1]-1，因为P[i]到i的字符是回文串，那么P[i]+1到i-1的字符也是回文串，这时P[i-1]=p[i]+1<P[i-1]是矛盾的），最后取P[i]的最大值。