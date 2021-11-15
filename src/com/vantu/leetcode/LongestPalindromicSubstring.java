package com.vantu.leetcode;

import javafx.scene.layout.Pane;

/**
 * Create by TranVanTu on 11/6/2021 11:50 AM
 * Desc: https://leetcode.com/problems/longest-palindromic-substring/
 **/
public class LongestPalindromicSubstring {
    public static boolean checkString(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1) ) {
                return false;
            }
        }
        return true;
    }

    /**
     * Native solution
     * @param args
     */
//    public static String longestPalindrome(String s) {
//        int MAX = 0;
//        System.out.println(s.length());
//        String temp, result = s;
//        for (int i = 0; i < s.length() - 1; i++) {
//            for (int  j = i + 1; j <= s.length(); j++) {
//                temp = s.substring(i, j);
//                if (checkString(temp)) {
//                    if (temp.length() > MAX) {
//                        result = temp;
//                        MAX = temp.length();
//                    }
//                }
//            }
//        }
//        return result;
//    }
    public static String longestPalindrome(String s) {
        final int MAX_N = 1000;
        boolean[][] arr = new boolean[MAX_N][MAX_N];
        for (int i = 0; i < s.length(); i++) {
            arr[i][i] = true;
        }
        for (int cl = 2; cl <= s.length(); cl++) {
            

        }

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        return null ;

    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abbcbbadf"));
    }

}
