package com.vantu.leetcode.TwoPointer;

/**
 * RemoveDuplicateFromArray
 *
 * @author Tu Tran
 * @version RemoveDuplicateFromArray.java Nov 18 2021 14:23 tvtu
 * @desc: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 **/
public class RemoveDuplicateFromArray {
    public static int removeDuplicates(int[] nums) {
        int flag = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[flag]) {
                nums[++flag] = nums[i];
            }
        }
        return flag + 1;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }
}
