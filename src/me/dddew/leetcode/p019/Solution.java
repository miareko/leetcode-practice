package me.dddew.leetcode.p019;


public class Solution {
    
	public ListNode removeNthFromEnd(ListNode head, int n) {
		
		if(head == null || n == 0) {
			return head;
		}
        
		ListNode fast = new ListNode(0);
		ListNode slow = new ListNode(0);
		ListNode pre = null;
		fast = head;
		slow = head;
		
		for(int i = 0 ; i < n; i++) {
			if(fast != null) {
				fast = fast.next;
			}
		}
		
		while(fast != null) {
			pre = slow;
			slow = slow.next;
			fast = fast.next;
		}
		
		if(pre == null) {
			head = slow.next;
		} else {
			pre.next = slow.next;
		}
		
		return head;
    }

	static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { 
			val = x; 
		}
	}
}
