package com.vantu.leetcode.Recursion;

/**
 * FibonacciNumber
 *
 * @author Tu Tran
 * @version FibonacciNumber.java Nov 17 2021 16:00 tvtu
 * @desc: https://leetcode.com/problems/fibonacci-number/
 **/
public class FibonacciNumber {
    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
