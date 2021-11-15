package com.vantu.leetcode.SlidingWindows;

/**
 * MaxConsecutive
 *
 * @author Tu Tran
 * @version MaxConsecutive.java Nov 15 2021 10:25 tvtu
 * @desc: https://leetcode.com/problems/max-consecutive-ones-iii/
 **/
public class MaxConsecutive {
    public static int longestOnes(int[] nums, int k) {
        int i = 0, maxLength = -1, n = nums.length;
        int flag = 0, nextFlag;
        int begin = i, end  = i;
        int count = 0;
        while (i < n) {
            if (k == count) {
                if (maxLength < (i - flag)) {
                    maxLength = i - flag;
                }
            } else {
                if (nums[i] == 0) {
                    count++;
                }
            }
        }
        System.out.println(begin);
        System.out.println(end);
        return 0;
    }

    public static void main(String[] args) {
        longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2);
    }
}
