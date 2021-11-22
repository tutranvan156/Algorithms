package com.vantu.leetcode.TwoPointer;

/**
 * TrappingRainWater
 *
 * @author Tu Tran
 * @version TrappingRainWater.java Nov 22 2021 11:20 tvtu
 * @desc: https://leetcode.com/problems/trapping-rain-water/solution/
 **/
public class TrappingRainWater {
    public static int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int left_max = height[left], right_max = height[right];
        int res = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= left_max) {
                    left_max = height[left];
                } else {
                    res += left_max - height[left];
                }
                left++;
            } else {
                if (height[right] >= right_max) {
                    right_max = height[right];
                } else {
                    res += right_max - height[right];
                }
                right--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }
}
