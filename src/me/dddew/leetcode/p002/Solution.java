package me.dddew.leetcode.p002;

/**
 * 2. Add Two Numbers
 *	@see <a href="https://leetcode.com/problems/add-two-numbers/">https://leetcode.com/problems/add-two-numbers/</a>
 *
 *	You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *	Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 *	Output: 7 -> 0 -> 8
 */
public class Solution {

	/**
	 * 主要是链表的使用
	 * 熟悉JVM内存
	 */
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
		if(l1 == null || l2 == null) {
			return null;
		}
		
		int sum = 0;
		ListNode head = new ListNode(0);
		ListNode point = head;
		
		while(l1 != null && l2 != null) {
			sum += (l1.val + l2.val);
			point.next = new ListNode(sum % 10);
			sum /= 10;
			point = point.next;
			l1 = l1.next;
			l2 = l2.next;
		}
		
		while(l1 != null) {
			sum += l1.val;
			point.next = new ListNode(sum % 10);
			sum /= 10;
			point = point.next;
			l1 = l1.next;
		}
		
		while(l2 != null) {
			sum += l2.val;
			point.next = new ListNode(sum % 10);
			sum /= 10;
			point = point.next;
			l2 = l2.next;
		}
		
		if(sum > 0) {
			point.next = new ListNode(sum);
		}
		
		return head.next;
    }
	
}
