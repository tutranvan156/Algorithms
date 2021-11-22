package com.vantu.leetcode.DataStruct.Array;

/**
 * FirstMissingPositive
 *
 * @author Tu Tran
 * @version FirstMissingPositive.java Nov 19 2021 15:59 tvtu
 * @desc: https://leetcode.com/problems/first-missing-positive/
 **/
public class FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] > n) {
                nums[i] = n + 1;
            }
        }
        for (int i = 0; i < n; i++) {
            if (Math.abs(nums[i]) < n + 1) {
                int num = Math.abs(nums[i]) - 1;
                nums[num] = -1 * Math.abs(nums[num]);
            }
        }
        for (int i = 0; i < n; i++) {
            if ((nums[i] <= (n + 1)) && nums[i] > 0) {
                return (i + 1);
            }
        }
        return (n + 1);
    }

    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{1, 1}));
    }
}
