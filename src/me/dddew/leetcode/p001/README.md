## Two Sum

[https://leetcode.com/problems/two-sum/](https://leetcode.com/problems/two-sum/)

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution.

**Example:**

	Given nums = [2, 7, 11, 15], target = 9,
	
	Because nums[0] + nums[1] = 2 + 7 = 9,
	return [0, 1].

<br>

### 解题思路

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;本题比较简单，关键是降低时间复杂度。

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;从左往右扫描，并将当前位置的数字和位置放入HashMap，当扫描到HashMap中有和当前数字符合要求的数字时，返回两数的位置。时间复杂度为O(n)，因为HashMap查找的时间复杂度为O(1)。

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;还有一种时间复杂度为O(nlogn)的算法，排序之后使用夹逼准则。
