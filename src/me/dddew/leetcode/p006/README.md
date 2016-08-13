## ZigZag Conversion

[https://leetcode.com/problems/zigzag-conversion/](https://leetcode.com/problems/zigzag-conversion/)

The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

	P   A   H   N
	A P L S I I G
	Y   I   R

And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

	string convert(string text, int nRows);

convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".

<br>

### 解题思路

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;找规律，对于n行中的第i行满足如下规律：

1.	当i=1或i=n时，输出第 `i+(2n-2)t` 个字符 [其中t为非负整数且i+(2n-2)t<=n]；
2.	其他情况下，交替输出第 `i+(2n-2)t` 和第 `(2n-2)t+2n-i` 个字符。