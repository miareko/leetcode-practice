package me.dddew.leetcode.p021;

public class Solution {
	
	static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
		ListNode tmpNode = new ListNode(0);
		ListNode combNode = tmpNode;
		
		if(l1 != null || l2 != null) {
			while(l1 != null && l2 != null) {
				if(l1.val > l2.val) {
					tmpNode.next = l2;
					l2 = l2.next;
					tmpNode = tmpNode.next;
				} else {
					tmpNode.next = l1;
					l1 = l1.next;
					tmpNode = tmpNode.next;
				}
			}
			
			if(l1 != null) {
				tmpNode.next = l1;
			}
			
			if(l2 != null) {
				tmpNode.next = l2;
			}
		}
		
		return combNode.next;
    }
	
}
