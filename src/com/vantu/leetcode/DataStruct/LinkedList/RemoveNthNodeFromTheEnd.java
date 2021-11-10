package com.vantu.leetcode.DataStruct.LinkedList;

/**
 * RemoveNthNodeFromTheEnd
 *
 * @author Tu Tran
 * @version RemoveNthNodeFromTheEnd.java Nov 10 2021 16:00 tvtu
 * @desc: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 **/
public class RemoveNthNodeFromTheEnd {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int count = 1;
        while (temp.next != null) {
            temp = temp.next;
            count++;
        }
        int res = count - n - 1;
        if (res == -1) {
            return head.next;
        }
        temp = head;
        while (res > 0) {
            temp = temp.next;
            res--;
        }
        if (temp.next == null) {
            return null;
        } else temp.next = temp.next.next;
        return head;
    }

    public static void main(String[] args) {
        removeNthFromEnd(new ListNode().convertToLinkedList(new int[]{1}), 1);
    }
}
