package com.vantu.leetcode.TwoPointer;

import sun.nio.cs.ext.MacHebrew;

/**
 * CountBinarySubstring
 *
 * @author Tu Tran
 * @version CountBinarySubstring.java Nov 11 2021 13:59 tvtu
 * @desc: https://leetcode.com/problems/count-binary-substrings/
 **/
public class CountBinarySubstring {
    public static int countBinarySubstrings(String s) {
        int count = 0, prev = 0, cur = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) != s.charAt(i)) {
                count += Math.min(prev, cur);
                prev = cur;
                cur = 1;
            } else {
                cur++;
            }
        }
        return count + Math.min(prev, cur);
    }

    public static void main(String[] args) {
        System.out.println(countBinarySubstrings("1010001100"));

    }
}
