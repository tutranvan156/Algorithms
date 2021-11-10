package com.vantu.leetcode.DataStruct.LinkedList;

/**
 * ConvertBinaryToLinkedList
 *
 * @author Tu Tran
 * @version ConvertBinaryToLinkedList.java Nov 10 2021 14:01 tvtu
 * @desc: https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 **/
public class ConvertBinaryToLinkedList {
    static class Solution {
        public int getDecimalValue(ListNode head) {
            int num = head.val;
            while (head.next != null)  {
                num = num * 2 + head.next.val;
                head = head.next;
            }
            return num;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1,0,0,1,0,0,1,1,1,0,0,0,0,0,0};
        ListNode listNode = new ListNode();
        System.out.println(solution.getDecimalValue(listNode.convertToLinkedList(arr)));
    }
}
