package com.vantu.leetcode.DataStruct;

/**
 * AddTwoNumber
 *
 * @author Tu Tran
 * @version AddTwoNumber.java Nov 02 2021 14:27 tvtu
 * @desc: https://leetcode.com/problems/add-two-numbers/
 **/
public class AddTwoNumber {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dumpHead = new ListNode(0);
        ListNode p = l1, q = l2, current = dumpHead;
        int carry = 0;
        while(p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            current.next = new ListNode(1);
        }
        return dumpHead.next;
    }

    public static void main(String[] args) {

    }
}