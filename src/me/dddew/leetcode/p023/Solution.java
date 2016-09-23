package me.dddew.leetcode.p023;

public class Solution {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode mergeKLists(ListNode[] lists) {

        if(lists == null || lists.length == 0) {
            return null;
        }

        ListNode combNode = new ListNode(0);
        ListNode tmpNode = combNode;

        int length = lists.length;
        int delta = 1;
        int index = 0;

        while(delta < length) {

            while(index + delta < length) {
                lists[index] = merge2Lists(lists[index], lists[index + delta]);
                index += 2 * delta;
            }
            index = 0;
            delta <<= 1;
        }
        return lists[0];
    }

    public ListNode merge2Lists(ListNode l1, ListNode l2) {

        ListNode combNode = new ListNode(0);
        ListNode tmpNode = combNode;

        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                tmpNode.next = l1;
                l1 = l1.next;
            } else {
                tmpNode.next = l2;
                l2 = l2.next;
            }
            tmpNode = tmpNode.next;
        }

        while(l1 != null) {
            tmpNode.next = l1;
            l1 = l1.next;
            tmpNode = tmpNode.next;
        }

        while(l2 != null) {
            tmpNode.next = l2;
            l2 = l2.next;
            tmpNode = tmpNode.next;
        }

        return combNode.next;
    }
}
