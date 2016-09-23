## Merge Two Sorted Lists

[https://leetcode.com/problems/merge-two-sorted-lists/](https://leetcode.com/problems/merge-two-sorted-lists/)

Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

<br>

### 解题思路
       
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;问题的关键是定义一个合并链表和一个指向合并链表头部的节点（用于返回）。遍历已排序的两个链表，然后将较小的元素加入合并链表的尾部，直到其中一个链表遍历完成，最后将另一个链表也加入合并链表的尾部。