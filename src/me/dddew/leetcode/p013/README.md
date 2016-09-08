## Roman to Integer

[https://leetcode.com/problems/roman-to-integer/](https://leetcode.com/problems/roman-to-integer/)

Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.

<br>

### 解题思路
       
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;这道题可以从前往后转换，也可以从后往前转换。若使用从后往前遍历，对于每一个字符c：

- c = I时，结果累加1；
- c = Ⅴ时，若前一个字符为I，累加4并略过前一字符；否则累加5；
- c = Ⅹ时，若前一个字符为I，累加9并略过前一个字符；否则累加10；
- c = Ⅼ时，若前一个字符为X，累加40并略过前一个字符；否则累加50；
- c = Ⅽ时，若前一个字符为X，累加90并略过前一个字符；否则累加100；
- c = D时，若前一个字符为C，累加400并略过前一个字符；否则累加500；
- c = M时，若前一个字符为C，累加900并略过前一个字符；否则累加1000。