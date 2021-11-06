package com.vantu.leetcode;

/**
 * LongestSubString
 *
 * @author Tu Tran
 * @version LongestSubString.java Nov 02 2021 15:03 tvtu
 * @desc: https://leetcode.com/problems/longest-substring-without-repeating-characters/solution/
 **/
public class LongestSubString {
    public static int lengthOfLongestSubstring(String s) {
        int[] chars = new int[128];
        int left = 0;
        int right = 0;
        int res = 0;
        while (right < s.length()) {
            char r = s.charAt(right);
            chars[r]++;
            while (chars[r] > 1) {
                char l = s.charAt(left);
                chars[l]--;
                left++;
            }
            res = Math.max(res, right - left + 1);
            right++;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abccadfbadsfadf"));

    }
}
