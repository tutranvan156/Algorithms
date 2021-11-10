package com.vantu.leetcode.DataStruct.LinkedList;

/**
 * MiddleOfLinkedList
 *
 * @author Tu Tran
 * @version MiddleOfLinkedList.java Nov 10 2021 14:50 tvtu
 * @desc: https://leetcode.com/problems/middle-of-the-linked-list/
 **/
public class MiddleOfLinkedList {
    public static ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        ListNode head = new ListNode().convertToLinkedList(a);
        System.out.println(middleNode(head).val);
    }
}
