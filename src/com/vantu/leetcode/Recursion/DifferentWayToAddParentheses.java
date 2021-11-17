package com.vantu.leetcode.Recursion;

import java.util.List;

/**
 * DifferentWayToAddParentheses
 *
 * @author Tu Tran
 * @version DifferentWayToAddParentheses.java Nov 17 2021 16:32 tvtu
 * @desc: https://leetcode.com/problems/different-ways-to-add-parentheses/
 **/
public class DifferentWayToAddParentheses {
    public static List<Integer> diffWaysToCompute(String expression) {
        int n = expression.length();
        int[] nums = new int[20];
        char[] exp = new char[20];
        int tempNums = 0, tempExp = 0;
        for (int i = 0; i < n; i++) {
            if (Character.isDigit(expression.charAt(i))) {
                nums[tempNums] = Integer.parseInt(String.valueOf(expression.charAt(i)));
                tempNums++;
            } else {
                exp[tempExp] = expression.charAt(i);
                tempExp++;
            }
        }
        int[][] arr = new int[tempExp][tempExp];
        for (int i = 0; i < tempExp; i++) {
            arr[i][i] = cal(exp[i], nums[i], nums[i + 1]);
        }
        for (int i = 0; i < tempExp - 1; i++) {
            for (int j = i + 1; j < tempExp; j++) {
                arr[i][j] = arr[i][j] + arr[i][j - 1];
            }
        }
        for (int i = 0; i < tempExp; i++) {
            System.out.println();
            for (int j = i + 1; j < tempExp; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }

        return null;
    }
    public static int cal(char c, int x, int y) {
        if (c == '*') {
            return x * y;
        } else if (c == '-') {
            return x - y;
        } else return x + y;
    }

    public static void main(String[] args) {
        diffWaysToCompute("2-1-1");
    }
}
