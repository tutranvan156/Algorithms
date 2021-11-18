package com.vantu.leetcode.Math;

/**
 * DivideTwoIntegers
 *
 * @author Tu Tran
 * @version DivideTwoIntegers.java Nov 18 2021 16:33 tvtu
 * @desc: https://leetcode.com/problems/divide-two-integers/
 **/
public class DivideTwoIntegers {
    public static int divide(int dividend, int divisor) {

        System.out.println(Integer.MAX_VALUE + 1);
//        int k = 1;
//        if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) {
//            k = -1;
//        }
//        if (dividend <= Integer.MIN_VALUE || dividend > Integer.MAX_VALUE) {
//            if (dividend == Integer.MIN_VALUE) {
//                l = -1;
//            }
//            if (dividend < Integer.MIN_VALUE) {
//                dividend = Integer.MAX_VALUE + 1;
//            } else {
//                dividend = Integer.MAX_VALUE;
//            }
//        }
//        if (divisor == Integer.MIN_VALUE || divisor > Integer.MAX_VALUE) {
//            if (divisor == Integer.MIN_VALUE) {
//                k = -1;
//            }
//            divisor = Integer.MAX_VALUE;
//        }
//        int count = 0;
//        while (dividend > (divisor << 1)) {
//            dividend = dividend - (divisor << 1);
//            count +=2;
//        }
//        if (dividend >= divisor) {
//            count++;
//        }
//        int temp = -1;
//        if ((l < 0 && k < 0) || (l > 0 && k > 0)) temp = 1;
//        return temp < 0 ? -count : count;
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(divide(-2147483648,-1 ));
    }
}
