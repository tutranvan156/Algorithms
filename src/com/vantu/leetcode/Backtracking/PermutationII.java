package com.vantu.leetcode.Backtracking;

import java.util.*;

/**
 * PermutationII
 *
 * @author Tu Tran
 * @version PermutationII.java Nov 22 2021 14:13 tvtu
 * @desc: https://leetcode.com/problems/permutations-ii/
 **/
public class PermutationII {
    public static List<List<Integer>> permuteUnique(int[] nums) {
        int n = nums.length;
        boolean[] check = new boolean[n];
        Set<List<Integer>> resSet = new HashSet<>();
        Arrays.fill(check, true);
        Stack<Integer> st = new Stack<>();
        List<List<Integer>> res = new ArrayList<>();
        Generate(resSet, check, st, nums, n);
        return new ArrayList<>(resSet);
    }
    public static void Generate(Set<List<Integer>> resSet, boolean[] check, Stack<Integer> st, int[] nums, int n) {
        if (st.size() == n) {
            resSet.add(new ArrayList<>(st));
        } else {
            for (int i = 0; i < n; i++) {
                if (check[i]) {
                    st.push(nums[i]);
                    check[i] = false;
                    Generate(resSet, check, st, nums, n);
                    st.pop();
                    check[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(permuteUnique(new int[]{1, 1, 2}));
    }
}
