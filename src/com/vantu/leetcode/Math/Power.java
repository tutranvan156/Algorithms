package com.vantu.leetcode.Math;

/**
 * Power
 *
 * @author Tu Tran
 * @version Power.java Nov 22 2021 15:38 tvtu
 * @desc: https://leetcode.com/problems/powx-n/
 **/
public class Power {
    public static double myPow(double x, int n) {
        if (n == 1 || n == -1) {
            return x;
        }
        if (n > 0) {
            return x * myPow(x, n - 1);
        } else {
            return (1 / (x * myPow(x, n + 1)));
        }
    }

    public static void main(String[] args) {
        System.out.println(myPow(2, -2));
    }
}
