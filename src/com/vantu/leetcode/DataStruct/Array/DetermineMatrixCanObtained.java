package com.vantu.leetcode.DataStruct.Array;

import java.util.Arrays;

/**
 * DetermineMatrixCanObtained
 * The important thing:
 * When rotate 90 degree we must do two things:
 * Row -> Column -> Then reverse it
 *
 * @author Tu Tran
 * @version DetermineMatrixCanObtained.java Nov 22 2021 14:33 tvtu
 * @desc: https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
 **/
public class DetermineMatrixCanObtained {
    public static boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        int count = 3;
        while (count > 0) {
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n / 2; j++) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[i][n - j - 1];
                    mat[i][n - j - 1] = temp;
                }
            }

            boolean flag = true;
            for (int i = 0; i < n; i++) {
                if (!Arrays.equals(mat[i], target[i])) {
                    flag = false;
                    break;
                }
            }
            if (flag) return true;
            count--;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(findRotation(new int[][]{
                {0, 1}, {1, 0}
        }, new int[][]{
                {1, 0}, {0, 1}}));
    }
}
