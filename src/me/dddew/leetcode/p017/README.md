## Letter Combinations of a Phone Number

[https://leetcode.com/problems/letter-combinations-of-a-phone-number/](https://leetcode.com/problems/letter-combinations-of-a-phone-number/)

Given a digit string, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below.
   
![](200px-Telephone-keypad2.svg.png)

    Input:Digit string "23"
    Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
    
**Note:**

Although the above answer is in lexicographical order, your answer could be in any order you want.

<br>

### 解题思路
       
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;这道题就是求从每一个集合中取一个字符所组成不同字符串的集合，可以使用递归实现N重循环解决问题。

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;如果不使用递归。假设一共有N个数（即N个集合），每个集合有NUM[i]个元素，用N维数组INDEX[]表示从每个集合取出的元素的位置，那么INDEX[0] INDEX[1] …… INDEX[N-1]从0 0 …… 0每次递增1直到NUM[0] NUM[1] …… NUM[n-1]（像数字一样）就是所有结果的位置集合。