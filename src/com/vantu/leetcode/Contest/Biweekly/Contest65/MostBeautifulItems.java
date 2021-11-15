package com.vantu.leetcode.Contest.Biweekly.Contest65;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/**
 * Create by TranVanTu on 11/13/2021 9:58 PM
 * Desc: https://leetcode.com/contest/biweekly-contest-65/problems/most-beautiful-item-for-each-query/
 **/
public class MostBeautifulItems {
    public static int[] maximumBeauty(int[][] items, int[] queries) {
        int n = items.length;
        int m = queries.length;
        int[] d = new int[m];
        TreeMap<Integer, Integer> sortArray = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            sortArray.put(items[i][0], items[i][1]);
        }
        for (int i = 0; i < m; i++) {
            sortArray.entrySet();

        }
        for (Map.Entry<Integer, Integer> entry : sortArray.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        return null;
    }

    public static void main(String[] args) {
        maximumBeauty(new int[][]{{1,2},{3,2},{2,4},{5,6},{3,5}}, new int[]{1,2,3,4,5,6});
    }
}
