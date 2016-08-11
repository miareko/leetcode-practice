package me.dddew.leetcode.p002;

public class Solution {

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
