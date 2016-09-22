## 4Sum

[https://leetcode.com/problems/4sum/](https://leetcode.com/problems/4sum/   )

Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.
    
**Note:** The solution set must not contain duplicate quadruplets.

    For example, given array S = [1, 0, -1, 0, -2, 2], and target = 0.
    
    A solution set is:
    [
      [-1,  0, 0, 1],
      [-2, -1, 1, 2],
      [-2,  0, 0, 2]
    ]

<br>

### 解题思路
       
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;4Sum问题转化成3Sum问题，3Sum问题转化成2Sum问题求解，注意去重。