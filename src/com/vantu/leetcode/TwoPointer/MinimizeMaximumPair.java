package com.vantu.leetcode.TwoPointer;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * MinimizeMaximumPair
 *
 * @author Tu Tran
 * @version MinimizeMaximumPair.java Nov 11 2021 09:52 tvtu
 * @desc: https://leetcode.com/problems/minimize-maximum-pair-sum-in-array/
 **/
public class MinimizeMaximumPair {

    public static int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i = nums.length / 2 - 1, j = i + 1;
        int temp;
        int maxResult = -1;
        while (i >= 0) {
            temp = nums[i] + nums[j];
            maxResult = maxResult < temp  ? temp : maxResult;
            i--;
            j++;
        }
        return maxResult;

    }

    public static void main(String[] args) {
        System.out.println(minPairSum(new int[]{4,1,5,1,2,5,1,5,5,4}));
    }
}
