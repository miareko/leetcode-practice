package me.dddew.leetcode.p024;


public class Solution {
	
	static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
		
		void print() {
			System.out.print(val);
			ListNode node = this;
			while((node = node.next) != null) {
				System.out.print("->" + node.val);
			}
		}
	}
	
    public ListNode swapPairs(ListNode head) {
        
    	ListNode tmpNode = new ListNode(0);
    	ListNode combNode = tmpNode;
    	ListNode fakeNode = tmpNode;
    	
    	while(head != null) {
    		
    		if(head.next != null) {
    			fakeNode = head;
    			head = head.next.next;
    			
    			fakeNode.next.next = null;
    			tmpNode.next = fakeNode.next;
    			fakeNode.next = null;
    			tmpNode.next.next = fakeNode;
    			
    			tmpNode = tmpNode.next.next;
    		} else {
    			tmpNode.next = head;
    			head = head.next;
    			tmpNode = tmpNode.next;
    		}
    	}
    	return combNode.next;
    }
    
    public static void main(String[] args) {
    	ListNode node = new ListNode(0);
    	node.next = new ListNode(1);
    	node.next.next = new ListNode(2);
    	node.next.next.next = new ListNode(3);
    	node.next.next.next.next = new ListNode(2);
		
    	new Solution().swapPairs(node).print();
	}

}
