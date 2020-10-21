package me.dddew.leetcode.p876;

import me.dddew.leetcode.ListNode;

/**
 * @author miareko
 * @date 2020-10-20
 */
public class Solution {

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return fast.next == null ? slow : slow.next;
    }
}
