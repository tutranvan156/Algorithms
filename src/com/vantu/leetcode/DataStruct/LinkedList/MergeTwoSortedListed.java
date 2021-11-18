package com.vantu.leetcode.DataStruct.LinkedList;

/**
 * MergeTwoSortedListed
 *
 * @author Tu Tran
 * @version MergeTwoSortedListed.java Nov 18 2021 10:41 tvtu
 * @desc: https://leetcode.com/problems/merge-two-sorted-lists/
 **/
public class MergeTwoSortedListed {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
    public static void main(String[] args) {
        int[] list1 = new int[]{1, 2, 4};
        int[] list2 = new int[]{1, 3, 4};
        ListNode l1 = ListNode.convertToLinkedList(list1);
        ListNode l2 = ListNode.convertToLinkedList(list2);
        mergeTwoLists(l1, l2);
    }

}
