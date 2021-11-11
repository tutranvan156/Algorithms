package com.vantu.leetcode.TwoPointer;

/**
 * MoveZeros
 *
 * @author Tu Tran
 * @version MoveZeros.java Nov 11 2021 15:00 tvtu
 * @desc: https://leetcode.com/problems/move-zeroes/
 **/
public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                int flag = i;
                for (int j = i + 1; j < n; j++) {
                    if (nums[j] != 0) {
                        int temp = nums[flag];
                        nums[flag] = nums[j];
                        nums[j] = temp;
                        flag++;
                    }
                }
                break;
            }
        }
    }
    public static void main(String[] args) {
        moveZeroes(new int[]{1,0,0,3,12});
    }
}
