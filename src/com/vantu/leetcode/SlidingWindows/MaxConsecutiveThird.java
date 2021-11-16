package com.vantu.leetcode.SlidingWindows;

/**
 * MaxConsecutiveThird
 * I was stolen this code, this was brilliant
 * Master in using two pointer
 *
 * @author Tu Tran
 * @version MaxConsecutiveThird.java Nov 15 2021 10:25 tvtu
 * @desc: https://leetcode.com/problems/max-consecutive-ones-iii/
 **/
public class MaxConsecutiveThird {
    public static int longestOnes(int[] nums, int k) {
        int start = 0, end, zeros = 0;
        for (end = 0; end < nums.length; end++) {
            if (nums[end] == 0)  {
                zeros++;
            }
            if (zeros > k && nums[start++] == 0) {
                zeros--;
            }
        }
        return end - start;
    }

    public static void main(String[] args) {
        System.out.println(longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2));
    }
}
