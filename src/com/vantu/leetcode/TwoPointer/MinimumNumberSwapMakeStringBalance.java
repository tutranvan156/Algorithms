package com.vantu.leetcode.TwoPointer;

import java.util.Stack;

/**
 * MinimumNumberSwapMakeStringBalance
 *
 * @author Tu Tran
 * @version MinimumNumberSwapMakeStringBalance.java Nov 11 2021 10:14 tvtu
 * @desc: https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-string-balanced/
 **/
public class MinimumNumberSwapMakeStringBalance {
    public static int minSwaps(String s) {
        int stack_size = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[') {
                stack_size++;
            } else {
                if (stack_size > 0)
                    stack_size--;
            }
        }
        return (stack_size + 1) / 2;
    }

    public static void main(String[] args) {
        System.out.println(minSwaps("]]][[[[]"));

    }
}
