package com.vantu.leetcode.DP;

import sun.nio.cs.ext.MacHebrew;

/**
 * TrappingRainWaterDP
 *
 * @author Tu Tran
 * @version TrappingRainWaterDP.java Nov 22 2021 10:28 tvtu
 * @desc: https://leetcode.com/problems/trapping-rain-water/solution/
 **/
public class TrappingRainWaterDP {
    public static int trap(int[] height) {
        int n = height.length;
        int[] d_left = new int[n];
        d_left[0] = height[0];
        for (int i = 1; i < n; i++) {
            d_left[i] = Math.max(height[i], d_left[i - 1]);
        }
        int[] d_right = new int[n];
        d_right[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            d_right[i] = Math.max(height[i], d_right[i + 1]);
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += Math.min(d_left[i], d_right[i]) - height[i];

        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}

