package com.vantu.leetcode.TwoPointer;

/**
 * FindDuplicateNumber
 *
 * @author Tu Tran
 * @version FindDuplicateNumber.java Nov 11 2021 16:44 tvtu
 * @desc: https://leetcode.com/problems/find-the-duplicate-number/
 **/
public class FindDuplicateNumber {
    public static int findDuplicate(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[Math.abs(nums[i])] < 0) {
                return Math.abs(nums[i]);
            } else {
                nums[Math.abs(nums[i])] = -nums[Math.abs(nums[i])];
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{1,3,4,2,2}));
    }
}
