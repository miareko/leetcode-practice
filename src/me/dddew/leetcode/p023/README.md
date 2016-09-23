## Merge k Sorted Lists

[https://leetcode.com/problems/merge-k-sorted-lists/](https://leetcode.com/problems/merge-k-sorted-lists/)

Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.

<br>

### 解题思路
       
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;类似于归并排序的思想，将链表两两合并，合并后的链表继续合并直到只剩一个链表。

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;如果采用迭代而非递归，则 **空间复杂度** 为 **O(1)**；设链表长为n，则 **时间复杂度** 为 2n * k/2 + 4n * k/4 + ... + kn * k/k = **O(nk log(k))** 