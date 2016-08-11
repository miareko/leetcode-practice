## Median of Two Sorted Arrays

[https://leetcode.com/problems/median-of-two-sorted-arrays/](https://leetcode.com/problems/median-of-two-sorted-arrays/)

There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

**Example 1:**

	nums1 = [1, 3]
	nums2 = [2]

The median is 2.0

**Example 2:**

	nums1 = [1, 2]
	nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5

<br>

### 解题思路

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;本题是求两个已排序序列的中位数。当数字总数为奇数时，找第[(m+n)/2+1]个元素,为偶数时，找第[(m+n)/2]和[(m+n)/2+1]然后求平均值。这时问题转化成了求两个有序序列的第K个元素。假设序列是升序的，那么第一个序列的前p个元素和第二个序列的前q个元素都小于或等于总序列的第K个元素，且p+q=k，这样第一个序列的第p个元素或第二个序列的第q个元素就是第K个元素。

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;如果第一个序列的第p个元素小于第二个序列的第q个元素，那么第一个序列的前p个元素都小于总序列的第K个元素，将它们全部抛弃，这时问题转化成了找新序列的第K-q个元素；同理，如果第二个序列的第q个元素小于第一个序列的第p个元素，则抛弃第二个序列的前q个元素，再找新序列的第K-p个元素，依次递归。而对于p，可以采用二分法，取p=k/2。递归终止的条件如下：

- 其中一个序列中的元素全部被抛弃，则返回另一个序列的第K个元素；
- 第一个序列的第p个元素等于第二个序列的第q个元素，则返回第一个序列的第p个元素；
- 当K为1时，取两个序列的第一个数中的较小的那一个。