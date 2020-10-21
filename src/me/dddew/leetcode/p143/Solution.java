package me.dddew.leetcode.p143;

/**
 * @author miareko
 * @date 2020-10-20
 */
public class Solution {

    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }
        ListNode temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next.next = head.next;
        head.next = temp.next;
        temp.next = null;
        reorderList(head.next.next);
    }

    public void reorderList2(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }
        // 找中间节点
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 翻转链表
        ListNode rest = slow.next;
        ListNode reversed = null;
        slow.next = null;
        while (rest != null) {
            ListNode temp = rest.next;
            rest.next = reversed;
            reversed = rest;
            rest = temp;
        }

        while (head != null && reversed != null) {
            ListNode temp = head.next;
            head.next = reversed;
            reversed = reversed.next;
            head.next.next = temp;
            head = temp;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        new Solution().reorderList2(head);
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
