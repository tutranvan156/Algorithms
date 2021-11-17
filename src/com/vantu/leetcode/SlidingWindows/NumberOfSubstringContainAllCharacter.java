package com.vantu.leetcode.SlidingWindows;

import java.util.Arrays;

/**
 * NumberOfSubstringContainAllCharacter
 * With this kind we should store it into array, this problem is not hard,
 * but I can not think clear on this
 *
 * @author Tu Tran
 * @version NumberOfSubstringContainAllCharacter.java Nov 16 2021 14:14 tvtu
 * @desc: https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/
 **/
public class NumberOfSubstringContainAllCharacter {
    public static int numberOfSubstrings(String s) {
        int n = s.length();
        int[] a = new int[3];
        int count = 0;
        Arrays.fill(a, 0);
        int begin = 0, end = 0;
        while (end < n) {
            a[(int) s.charAt(end) - 97]++;
            while (a[0] > 0 && a[1] > 0 && a[2] > 0) {
                count += n - end;
                a[(int) s.charAt(begin++) - 97]--;
            }
            end++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numberOfSubstrings("abcacb"));
    }
}
