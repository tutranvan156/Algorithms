package com.vantu.leetcode.DataStruct.LinkedList;

/**
 * SwapNodeInLinkedList
 *
 * @author Tu Tran
 * @version SwapNodeInLinkedList.java Nov 10 2021 16:52 tvtu
 * @desc: https://leetcode.com/problems/swapping-nodes-in-a-linked-list/
 **/
public class SwapNodeInLinkedList {
    public static ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        ListNode firstNode;
        int count = 1;
        while (temp.next != null) {
            temp = temp.next;
            count++;
        }
        if (count == 1) {
            return head;
        }
        if (k > count / 2) {
            k = count - k + 1;
        }
        //number of jump to find the lastNode
        int n = count - 2 * k + 1;
        //find firstNode
        temp = head;
        while (k > 1) {
            temp = temp.next;
            k--;
        }
        firstNode = temp;
        while (n > 0) {
            temp = temp.next;
            n--;
        }
        n = firstNode.val;
        firstNode.val = temp.val;
        temp.val = n;
        return head;
    }

    public static void main(String[] args) {
        swapNodes(new ListNode().convertToLinkedList(new int[]{1, 2, 3}), 2);
    }
}
