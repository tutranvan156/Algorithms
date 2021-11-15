package com.vantu.leetcode.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * ThreeSum
 *
 * @author Tu Tran
 * @version ThreeSum.java Nov 09 2021 13:43 tvtu
 * @desc: https://leetcode.com/problems/3sum/
 **/
public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        int temp;
        for (int i = 0; i < n - 2; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1, k = n - 1;
            while (j < k) {
                temp = nums[i] + nums[j] + nums[k];
                if (temp == 0) {
                    List<Integer> a = Arrays.asList(nums[i], nums[j], nums[k]);
                    result.add(a);
                    j++;
                    while (j < k && nums[j] == nums[j - 1]) j++;
                } else if (temp < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{0, 0, 0}));

    }
}
