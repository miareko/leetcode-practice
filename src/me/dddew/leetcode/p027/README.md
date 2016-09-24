## Remove Element

[https://leetcode.com/problems/remove-element/](https://leetcode.com/problems/remove-element/)

Given an array and a value, remove all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

**Example:**

Given input array nums = [3,2,2,3], val = 3

Your function should return length = 2, with the first two elements of nums being 2.

<br>

### 解题思路
       
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;由于本题不需要保证元素顺序，故可采用首尾向中间夹逼的方法，左侧遇到指定数字，就在右侧找到非指定数字填充。