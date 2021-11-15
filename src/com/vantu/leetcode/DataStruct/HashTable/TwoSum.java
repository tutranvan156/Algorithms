package com.vantu.leetcode.DataStruct.HashTable;

import java.util.HashMap;

/**
 * TwoSum
 *
 * @author Tu Tran
 * @version TwoSum.java Nov 12 2021 15:40 tvtu
 * @desc: https://leetcode.com/problems/two-sum/description/
 **/
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            result.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (result.containsKey(temp) && result.get(temp) != i) {
                return new int[]{i, result.get(temp)};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        twoSum(new int[]{2, 7, 11, 15}, 9);
    }
}
