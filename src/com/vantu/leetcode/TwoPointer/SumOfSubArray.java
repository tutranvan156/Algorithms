package com.vantu.leetcode.TwoPointer;

import java.util.Arrays;

/**
 * SumOfSubArray
 *
 * @author Tu Tran
 * @version SumOfSubArray.java Nov 11 2021 15:38 tvtu
 * @desc: https://leetcode.com/problems/range-sum-of-sorted-subarray-sums/
 **/
public class SumOfSubArray {
    public static int rangeSum(int[] nums, int n, int left, int right) {
        int[] a = new int[n * (n + 1) / 2];
        int idx = 0;
        int prev = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n ; j++) {
                a[idx] = prev + nums[j];
                prev = a[idx];
                idx++;
            }
            prev = 0;
        }
        Arrays.sort(a);
        int result = 0;
        int mod = 1000000007;
        for (int i  = left - 1; i < right; i++) {
            result = (result + a[i]) % mod;
        }
        return result;
    }

    public static void main(String[] args) {
        rangeSum(new int[]{1,2,3,4}, 4, 1, 5);
    }
}
