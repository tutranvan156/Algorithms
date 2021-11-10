package com.vantu.leetcode.DataStruct.LinkedList;

/**
 * MergeTwoLinkList
 *
 * @author Tu Tran
 * @version MergeTwoLinkList.java Nov 10 2021 15:15 tvtu
 * @desc: https://leetcode.com/problems/merge-in-between-linked-lists/
 **/
public class MergeTwoLinkedList {
    public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1;
        while(a > 1) {
            temp = temp.next;
            a--;
            b--;
        }
        ListNode i = temp;
        while(b > -1) {
            i = i.next;
            b--;
        }
        temp.next = list2;
        temp = list2;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = i;
        return list1;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode().convertToLinkedList(new int[]{0, 1, 2, 3, 4, 5});
        ListNode list2 = new ListNode().convertToLinkedList(new int[]{1000000,1000001,1000002});
        mergeInBetween(list1, 3 ,4, list2);
    }
}
