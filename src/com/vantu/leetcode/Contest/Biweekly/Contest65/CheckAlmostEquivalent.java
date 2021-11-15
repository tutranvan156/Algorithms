package com.vantu.leetcode.Contest.Biweekly.Contest65;

import java.util.Arrays;

/**
 * Create by TranVanTu on 11/13/2021 9:33 PM
 * Desc: https://leetcode.com/contest/biweekly-contest-65/problems/check-whether-two-strings-are-almost-equivalent/
 **/
public class CheckAlmostEquivalent {
    public static boolean checkAlmostEquivalent(String word1, String word2) {
        int[] a = new int[123];
        Arrays.fill(a, 0);
        for (int i = 0; i < word1.length(); i++) {
            int temp = Character.getNumericValue(word1.charAt(i));
            a[temp]++;
            temp = Character.getNumericValue(word2.charAt(i));
            a[temp]--;
        }
        for (int i = 0; i < word1.length(); i++) {
            if (Math.abs(a[Character.getNumericValue(word1.charAt(i))]) > 3 || Math.abs(a[Character.getNumericValue(word2.charAt(i))]) > 3) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkAlmostEquivalent("zzzyyy", "iiiiii"));
    }
}
