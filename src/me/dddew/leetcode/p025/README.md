## Reverse Nodes in k-Group

[https://leetcode.com/problems/reverse-nodes-in-k-group/](https://leetcode.com/problems/reverse-nodes-in-k-group/)

Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.

If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.

You may not alter the values in the nodes, only nodes itself may be changed.

Only constant memory is allowed.

For example,

Given this linked list: `1->2->3->4->5`

For k = 2, you should return: `2->1->4->3->5`

For k = 3, you should return: `3->2->1->4->5`

<br>

### 解题思路

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;本题是要将每组k个节点反序连接，需要注意对于最后一组节点如果少于k个，就不需要反序。Solution中提供的解法是定义一个指向新链尾部的节点lastNode，这个节点只在将一组k个节点全部反序连接后才会重新修改指向（指向新链最后一个节点）。所以在遍历节点时，只要将lastNode之后的节点链到当前节点的之后并将当前节点链接到lastNode之后（即插入到lastNode之后）即可。如果最后一组节点少于k个，将lastNode之后的节点重新反序。