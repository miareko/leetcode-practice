## Swap Nodes in Pairs

[https://leetcode.com/problems/swap-nodes-in-pairs/](https://leetcode.com/problems/swap-nodes-in-pairs/)

Given a linked list, swap every two adjacent nodes and return its head.

For example,

Given `1->2->3->4`, you should return the list as `2->1->4->3`.

Your algorithm should use only constant space. You may **not** modify the values in the list, only nodes itself can be changed.

<br>

### 解题思路

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;每两个相邻节点交换位置，只要每次从链表中截取两个节点反序链接到新链表之后即可。值得注意的是，截取的节点要将尾部置为空，避免出现死循环的情况。
