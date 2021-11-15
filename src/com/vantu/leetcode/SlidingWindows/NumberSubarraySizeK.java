package com.vantu.leetcode.SlidingWindows;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * NumberSubarraySizeK
 *
 * @author Tu Tran
 * @version NumberSubarraySizeK.java Nov 15 2021 09:29 tvtu
 * @desc: https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/
 **/
public class NumberSubarraySizeK {
    public static int numOfSubArrays(int[] arr, int k, int threshold) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length - k + 1; i++) {
            if (i == 0) {
                for (int j = 0; j < k; j++) {
                    sum += arr[j];
                }
            } else {
                sum = sum + (arr[i + k - 1] - arr[i - 1]);
            }
            if (sum >= threshold * k) {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {

        numOfSubArrays(new int[]{2,2,2,2,5,5,5,8}, 3, 4);
    }
}
