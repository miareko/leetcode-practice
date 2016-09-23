## Remove Nth Node From End of List

[https://leetcode.com/problems/remove-nth-node-from-end-of-list/](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)

Given a linked list, remove the nth node from the end of list and return its head.

For example,

	Given linked list: 1->2->3->4->5, and n = 2.
		
	After removing the second node from the end, the linked list becomes 1->2->3->5.
   
**Note:**

Given n will always be valid.

Try to do this in one pass.

<br>

### 解题思路
       
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;因为要求只遍历一次，所以需要有个参照。基于C的“双指针”思想，快指针先跑n步，然后两指针一起跑，这样它们之间始终保持n个节点的差距，直到快指针跑到尾部，慢指针所在位置就是要删除的节点。