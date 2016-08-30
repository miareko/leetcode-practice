## String to Integer (atoi)

[https://leetcode.com/problems/string-to-integer-atoi/](https://leetcode.com/problems/string-to-integer-atoi/)

Implement atoi to convert a string to an integer.

<br>

### 解题思路

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;第一个字符可以为‘+’或‘-’，之后遇到非数字或溢出返回结果。如果用long类型保存当前结果，溢出的判断很容易。该程序中结果用int保存，溢出的判断基于整型最大值和最小值。