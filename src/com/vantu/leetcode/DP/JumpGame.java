package com.vantu.leetcode.DP;

import java.util.Arrays;
import java.util.Collections;

/**
 * JumpGame
 *
 * @author Tu Tran
 * @version JumpGame.java Nov 22 2021 11:34 tvtu
 * @desc: https://leetcode.com/problems/jump-game/
 **/
public class JumpGame {
    public static boolean canJump(int[] nums) {
        int reach = 0;
        for (int  i = 0; i <= reach; i++) {
            reach = Math.max(reach, i + nums[i]);
            if (i >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(canJump(new int[]{2, 3, 1, 1, 4}));
    }
}
