package com.vantu.leetcode.TwoPointer;

import sun.nio.cs.ext.MacHebrew;

import java.util.Arrays;

/**
 * StrongestValueInArray
 *
 * @author Tu Tran
 * @version StrongestValueInArray.java Nov 11 2021 16:21 tvtu
 * @desc: https://leetcode.com/problems/the-k-strongest-values-in-an-array/
 **/
public class StrongestValueInArray {
    public static int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        int[] result = new int[k];
        int med = arr[(n - 1) / 2];
        int i = 0, j = n - 1;
        while (k > 0) {
            if (Math.abs(arr[i] - med) > Math.abs(arr[j] - med)) {
                result[k - 1] = arr[i];
                i++;
            } else {
                result[k - 1] = arr[j];
                j--;
            }
            k--;
        }
        return result;
    }

    public static void main(String[] args) {
        getStrongest(new int[]{6,7,11,7,6,8}, 3);

    }
}
