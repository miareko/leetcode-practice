## Longest Common Prefix

[https://leetcode.com/problems/longest-common-prefix/](https://leetcode.com/problems/longest-common-prefix/)

Write a function to find the longest common prefix string amongst an array of strings.

<br>

### 解题思路
       
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;从左到右比较所有字符串相同位置的字符（选择一个字符串作为参照，如第一个字符串），当其中一个字符串遍历到最尾部或某个位置上的字符不相同则终止比较。