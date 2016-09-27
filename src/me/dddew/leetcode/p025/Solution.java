package me.dddew.leetcode.p025;

public class Solution {

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode reverseKGroup(ListNode head, int k) {

		ListNode tmpNode = new ListNode(0);
		ListNode lastNode = tmpNode;
		ListNode fakeNode = tmpNode;
		ListNode combNode = tmpNode;

		int count = k;
		while (head != null) {

			while (head != null && count-- > 0) {
				fakeNode = head;
				head = head.next;
				fakeNode.next = lastNode.next;
				
				if(lastNode.next == null) {
					tmpNode = fakeNode;
				}
				lastNode.next = fakeNode;
			}
			
			if (count > 0) {
				head = lastNode.next;
				lastNode.next = null;
				
				while (head != null) {
					fakeNode = head;
					head = head.next;
					fakeNode.next = lastNode.next;
					lastNode.next = fakeNode;
				}
				break;
			}
			
			lastNode = tmpNode;
			count = k;
		}
		return combNode.next;
	}

}
