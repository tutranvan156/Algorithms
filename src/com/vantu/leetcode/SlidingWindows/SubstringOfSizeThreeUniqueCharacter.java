package com.vantu.leetcode.SlidingWindows;

/**
 * SubstringOfSizeThreeUniqueCharacter
 *
 * @author Tu Tran
 * @version SubstringOfSizeThreeUniqueCharacter.java Nov 15 2021 09:21 tvtu
 * @desc: https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/
 **/
public class SubstringOfSizeThreeUniqueCharacter {
    public static int countGoodSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            String temp = s.substring(i, i + 3);
            if (check(temp)) count++;
        }
        return count;
    }

    public static boolean check(String s) {
        if (s.charAt(0) == s.charAt(1) || s.charAt(1) == s.charAt(2) || s.charAt(0) == s.charAt(2)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        countGoodSubstrings("aababcabc");
    }
}
