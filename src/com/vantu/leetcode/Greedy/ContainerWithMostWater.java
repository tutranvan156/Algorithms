package com.vantu.leetcode.Greedy;

/**
 * ContainerWithMostWater
 *
 * @author Tu Tran
 * @version ContainerWithMostWater.java Nov 09 2021 11:54 tvtu
 * @desc: https://leetcode.com/problems/container-with-most-water/
 **/
public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int result = 0;
        int temp;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            temp = Math.min(height[i], height[j]) * (j - i);
            result = result < temp ? temp : result;
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 1};
        System.out.println(maxArea(a));

    }
}
