package com.vantu.leetcode.Math;

import java.util.*;
import java.util.stream.Collectors;

/**
 * MinimunTimeDifferent
 *
 * @author Tu Tran
 * @version MinimunTimeDifferent.java Nov 02 2021 12:01 tvtu
 * @desc: https://leetcode.com/problems/minimum-time-difference/
 *
 **/
public class MinimumTimeDifferent {
    public static int findMinDifference(List<String> timePoints) {
        final int HOUR = 60, DAY = 1440;
        int temp;
        List<Integer> time = new ArrayList<>();
        for (int i = 0; i < timePoints.size(); i++) {
            List<Integer> ints = Arrays.stream(timePoints.get(i).split(":"))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            if (ints.get(0) == 0) {
                temp = ints.get(0) * HOUR + ints.get(1);
                time.add(temp);
                temp = 24 * HOUR + ints.get(1);
                time.add(temp);
            } else {
                temp = ints.get(0) * HOUR + ints.get(1);
                time.add(temp);
                time.add(temp + DAY);
            }
        }
        Collections.sort(time);
        int MIN = 9999;
        for (int i = 0; i < time.size() - 1; i++) {
            if (time.get(i + 1) - time.get(i) < MIN) {
                MIN = time.get(i + 1) - time.get(i);
            }
        }
        return MIN;
    }
    public static void main(String[] args) {
        List<String> timePoints = Arrays.asList("12:12","00:13");
        System.out.println(findMinDifference(timePoints));
    }
}
