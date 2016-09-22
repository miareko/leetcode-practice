## Generate Parentheses

[https://leetcode.com/problems/generate-parentheses/](https://leetcode.com/problems/generate-parentheses/)

Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:

    [
      "((()))",
      "(()())",
      "(())()",
      "()(())",
      "()()()"
    ]

<br>

### 解题思路
       
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;典型的递归。一步步构造字符串，分别记录当前待匹配的左括号数量和剩余的左括号数量。对于某个位置，若有剩余的左括号，可以选择左括号，若有待匹配的左括号，也可选择右括号。