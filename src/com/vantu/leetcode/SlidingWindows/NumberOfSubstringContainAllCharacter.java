package com.vantu.leetcode.SlidingWindows;

import java.util.Arrays;

/**
 * NumberOfSubstringContainAllCharacter
 *
 * @author Tu Tran
 * @version NumberOfSubstringContainAllCharacter.java Nov 16 2021 14:14 tvtu
 * @desc: https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/
 **/
public class NumberOfSubstringContainAllCharacter {
    public static int numberOfSubstrings(String s) {
        /**
         * a = 97
         * b = 98
         * c = 99
         */
        int[] a = new int[3];
        Arrays.fill(a, 0);
        int begin = 0, end = 1;

        int count = 0;
        a[Character.getNumericValue(s.charAt(begin))]++;
        while (end < s.length()) {
            if (s. charAt(end) == s.charAt(begin)) {
                a[Character.getNumericValue(s.charAt(end))]--;
                begin++;
            } else {
                a[Character.getNumericValue(s.charAt(end))]++;
            }
            while (check(a)) {
                a[Character.getNumericValue(s.charAt(end))]--;
                begin++;
                count++;
            }
            end++;
        }
    }

    public static boolean check(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(numberOfSubstrings("abcacb"));
    }
}
