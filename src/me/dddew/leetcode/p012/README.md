## Integer to Roman

[https://leetcode.com/problems/integer-to-roman/](https://leetcode.com/problems/integer-to-roman/)

Given an integer, convert it to a roman numeral.

Input is guaranteed to be within the range from 1 to 3999.

<br>

### 解题思路

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;罗马数字共有7个，即Ⅰ（1）、Ⅴ（5）、Ⅹ（10）、Ⅼ（50）、Ⅽ（100）、Ⅾ（500）和Ⅿ（1000），拼写规则如下：

-  重复数次：一个罗马数字重复几次，就表示这个数的几倍。
-  右加左减：
       -  在较大的罗马数字的右边记上较小的罗马数字，表示大数字加小数字。
       -  在较大的罗马数字的左边记上较小的罗马数字，表示大数字减小数字。
       -  左减的数字有限制，仅限于I、X、C。比如45不可以写成VL，只能是XLV
       -  但是，左减时不可跨越一个位值。比如，99不可以用IC（ {100-1）表示，而是用XCIX（[100-10]+[10-1]）表示。（等同于阿拉伯数字每位数字分别表示。）
       -  左减数字必须为一位，比如8写成VIII，而非IIX。
       -  右加数字不可连续超过三位，比如14写成XIV，而非XIIII。（见下方“数码限制”一项。）
-  数码限制：
       -  同一数码最多只能连续出现三次，如40不可表示为XXXX，而要表示为XL。 
       
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;这道题主要在于如何处理每一位数字，从最高位开始处理，每一位上的数字的处理方法相同，对于任意位上的数字d:

-  d = 9时，用两个1开头的左减数字表示，如CM(900)、XC(90)、IX(9)；
-  5 <= d <= 8, 减去5开头的罗马数字，剩下的数字继续按规则处理；
-  d = 4时，由1和5表示的左减数字表示，如CD(400)、XL(40)、IV(4)；
-  d < 4时，由多个1开头的罗马数字表示。