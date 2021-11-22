package com.vantu.leetcode.Greedy;

import sun.nio.cs.ext.MacHebrew;

/**
 * TrappingRainWater
 *
 * @author Tu Tran
 * @version TrappingRainWater.java Nov 22 2021 09:51 tvtu
 * @desc: https://leetcode.com/problems/trapping-rain-water/
 **/
public class TrappingRainWaterNativeSolution {
    public static int trap(int[] height) {
        int res = 0;
        for (int i = 0; i < height.length; i++) {
            int left_max = 0, right_max = 0;
            int l = i - 1, r = i + 1;
            while (l >= 0) {
                if (height[l] > left_max) {
                    left_max = height[l];
                }
                l--;
            }
            while (r < height.length) {
                if (height[r] > right_max) {
                    right_max = height[r];
                }
                r++;
            }
            int temp = Math.min(left_max, right_max) - height[i];
            if (temp  > 0) {
                res += temp;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(trap(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}