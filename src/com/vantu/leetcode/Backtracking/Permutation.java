package com.vantu.leetcode.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Permutation
 *
 * @author Tu Tran
 * @version Permutation.java Nov 22 2021 13:48 tvtu
 * @desc: https://leetcode.com/problems/permutations/
 **/
public class Permutation {
    public static List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        boolean[] check = new boolean[n];
        Arrays.fill(check, true);
        Stack<Integer> st = new Stack<>();
        List<List<Integer>> res = new ArrayList<>();
        Generate(res, check, st, nums, n);
        return res;
    }
    public static void Generate(List<List<Integer>> res, boolean[] check, Stack<Integer> st, int[] nums, int n) {
        if (st.size() == n) {
            res.add(new ArrayList<>(st));
        } else {
            for (int i = 0; i < n; i++) {
                if (check[i]) {
                    st.push(nums[i]);
                    check[i] = false;
                    Generate(res, check, st, nums, n);
                    st.pop();
                    check[i] = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(permute(new int[]{1,2,3}));
    }
}
