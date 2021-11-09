package com.vantu.leetcode.DP;

import java.util.Arrays;

/**
 * LongestPalindromicSubstring
 *
 * @author Tu Tran
 * @version LongestPalindromicSubstring.java Nov 09 2021 10:13 tvtu
 * @desc: https://leetcode.com/problems/longest-palindromic-substring/
 **/
public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        int max = 0, x = 0, y = 0;
        int n = s.length();
        int[][] d = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                d[i][j] = 0;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j <= n - 1; j++) {
                if (i == j) {
                    d[i][j] = 1;
                } else if (s.charAt(i) == s.charAt(j)) {
                    if (j - i == 1) {
                        d[i][j] = 1;
                    } else {
                        d[i][j] = d[i + 1][j - 1];
                    }
                }
                if (d[i][j] == 1 && j - i > max) {
                    max = j - i;
                    x = i;
                    y = j;
                }
            }
        }
        return (String) s.subSequence(x, y + 1);
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abbcbbadf"));
    }
}
