package com.vantu.leetcode.SortAndSearch;

/**
 * SearchAndRotatedSortedArrays
 *
 * @author Tu Tran
 * @version SearchAndRotatedSortedArrays.java Nov 18 2021 17:34 tvtu
 * @desc: https://leetcode.com/problems/search-in-rotated-sorted-array/
 **/
public class SearchAndRotatedSortedArrays {
    public static int search(int[] nums, int target) {
        if(nums == null || nums.length == 0) return -1;
        int lo = 0, hi = nums.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (((nums[mid] - nums[nums.length - 1]) * (target - nums[nums.length - 1])) > 0) {
                if (nums[mid] < target) {
                    lo = mid + 1;
                } else {
                    hi = mid;
                }
            } else if (target > nums[nums.length - 1]) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return nums[lo] == target ? lo : -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[] {3, 1} , 3));
    }
}
