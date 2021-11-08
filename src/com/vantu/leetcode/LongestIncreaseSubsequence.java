package com.vantu.leetcode;

import java.util.*;

/**
 * LongestIncreseSubsequence
 *
 * @author Tu Tran
 * @version LongestIncreaseSubsequence.java Nov 08 2021 16:17 tvtu
 * @desc: https://leetcode.com/problems/longest-increasing-subsequence/submissions/
 **/
public class LongestIncreaseSubsequence {
    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        System.out.println(n);
        int[] d = new int[n];
        Arrays.fill(d, 1);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    d[i] = Math.max(d[i], d[j] + 1);
                }
            }
        }
        int ans = d[0];
        for (int i = 1; i < n; i++) {
            ans = Math.max(d[i], ans);
        }
        return ans;
    }
    public static void showListIncrease(int[] nums) {
        int n = nums.length;
        int d[] = new int[n], p[] = new int[n];
        Arrays.fill(d, 1);
        Arrays.fill(p, -1);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i ; j++) {
                if (d[j] < d[i] && d[i] < d[j] + 1) {
                    d[i] = d[j] + 1;
                    p[i] = j;
                }
            }
        }
        int pos = 0, ans = d[0];
        for (int i = 1; i < n; i++) {
            if (ans < d[i]) {
                ans = d[i];
                pos = i;
            }
        }


    }

    public static void main(String[] args) {
        int[] a = {3, 4, 20, 1, 11, 21};
        System.out.println(lengthOfLIS(a));
    }
}
