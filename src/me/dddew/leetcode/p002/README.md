## Add Two Numbers

[https://leetcode.com/problems/add-two-numbers/](https://leetcode.com/problems/add-two-numbers/)

You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

**Input:** (2 -> 4 -> 3) + (5 -> 6 -> 4)

**Output:** 7 -> 0 -> 8

<br>

### 解题思路

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;主要是考察链表的使用，熟悉JVM内存。两个引用，在刚开始时指向同一个初始节点。当加入新节点时，其中一个不变，另外一个指向新添加的节点。