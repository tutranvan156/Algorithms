package com.vantu.leetcode.Recursion;

/**
 * ReverseString
 *
 * @author Tu Tran
 * @version ReverseString.java Nov 17 2021 15:45 tvtu
 * @desc: https://leetcode.com/problems/reverse-string/
 **/
public class ReverseString {
    public static void reverseString(char[] s) {
        String result = f(String.valueOf(s));
        for (int i = 0; i < result.length(); i++) {
            s[i] = result.charAt(i);
        }
    }
    public static String f(String s) {
        int n = s.length();
        if (n == 1) {
            return s;
        }
        String left = s.substring(0, n / 2);
        String right = s.substring(n/2);
        return f(right) + f(left);
    }

    public static void main(String[] args) {

        reverseString(new char[]{'h','e','l','l','o'});
    }
}
