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
        int begin, end;
        int n = nums.length;
        if (target == nums[0] - 1) {
            return -1;
        }
        if (target >= nums[0]) {
            begin = 0;
            end = n - nums[0];
        } else {
            begin = n - nums[0] + 1;
            end = n - 1;
        }
        while (begin < end) {
            int temp = (end + begin) / 2;
            if (target == nums[temp]) {
                return temp;
            } else {
                if (target < nums[temp]) {
                    end = temp;
                } else {
                    begin = end;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[] {4,5,6,7,0,1,2} , 7));

    }
}
