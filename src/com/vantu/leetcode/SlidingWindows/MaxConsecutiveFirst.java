package com.vantu.leetcode.SlidingWindows;

/**
 * MaxConsecutiveFirst
 *
 * @author Tu Tran
 * @version MaxConsecutiveFirst.java Nov 16 2021 10:38 tvtu
 * @desc: https://leetcode.com/problems/max-consecutive-ones/
 **/
public class MaxConsecutiveFirst {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int head = -1, tail = 0;
        int n = nums.length;
        int maxLength = Integer.MIN_VALUE;
        while (tail < n) {
            if (nums[tail] == 0) {
                int temp = tail - head - 1;
                if (maxLength < temp) {
                    maxLength = temp;
                }
                head = tail;
                tail = head + 1;
            } else {
                tail++;
            }
        }
        if (maxLength < tail - head - 1) {
            maxLength = tail - head - 1;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1});

    }
}
