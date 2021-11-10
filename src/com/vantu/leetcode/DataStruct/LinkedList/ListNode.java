package com.vantu.leetcode.DataStruct.LinkedList;

/**
 * ListNode
 *
 * @author Tu Tran
 * @version ListNode.java Nov 10 2021 14:48 tvtu
 * @desc:
 **/
public class ListNode {
    int val;
    ListNode next;
    public ListNode() {
    }
    public ListNode(int val) {
        this.val = val;
    }
    public ListNode (int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    public ListNode convertToLinkedList(int[] arr) {

        ListNode head = null;
        ListNode tail = null;
        for (int i = 0; i < arr.length; i++) {
            ListNode temp = new ListNode(arr[i], null);
            if (head == null) {
                head = temp;
                tail = head;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }
        return head;
    }
}
