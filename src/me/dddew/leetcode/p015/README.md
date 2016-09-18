## 3Sum

[https://leetcode.com/problems/3sum/](https://leetcode.com/problems/3sum/)

Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

**Note:** The solution set must not contain duplicate triplets.
    
    For example, given array S = [-1, 0, 1, 2, -1, -4],
    
    A solution set is:
    [
      [-1, 0, 1],
      [-1, -1, 2]
    ]

<br>

### 解题思路
       
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;题中输出结果是升序的，故可先对整个序列进行排序。3Sum问题可以转化为2Sum问题求解（[https://leetcode.com/problems/two-sum/](https://leetcode.com/problems/two-sum/)），即对于任意一个nums[i]，在数组其他数中解2Sum问题，目标为-nums[i]；也可以转化为找数字问题（即对于任意的nums[i]和nums[j]，在数组的其他数字中找-nums[i]-nums[j]）。上面代码提供的解法是基于第二种方法。
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;本题关键是如何进行去重，在一次循环开始时，如果当前索引上的数字nums[i]与上一层循环的数字nums[i-1]相同，则可跳过当前循环。