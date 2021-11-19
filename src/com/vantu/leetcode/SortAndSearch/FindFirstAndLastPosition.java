package com.vantu.leetcode.SortAndSearch;

/**
 * FindFirstAndLastPosition
 *
 * @author Tu Tran
 * @version FindFirstAndLastPosition.java Nov 19 2021 14:17 tvtu
 * @desc: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 **/
public class FindFirstAndLastPosition {
    public static int[] searchRange(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        if (lo == hi) {
            if (nums[0] == target) {
                return new int[]{0, 0};
            } else {
                return new int[]{-1, -1};
            }
        }
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) {
                int left = mid, right = mid;
                while (left > 0 && nums[left - 1] == target ) {
                    left--;
                }
                while (right < hi && nums[right + 1] == target) {
                    right++;
                }
                return new int[]{left, right};
            }
            if (nums[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] res = searchRange(new int[]{1, 4}, 4);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
}
