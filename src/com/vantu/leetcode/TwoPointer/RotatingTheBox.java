package com.vantu.leetcode.TwoPointer;

/**
 * RotatingTheBox
 *
 * @author Tu Tran
 * @version RotatingTheBox.java Nov 11 2021 10:54 tvtu
 * @desc: https://leetcode.com/problems/rotating-the-box/
 **/
public class RotatingTheBox {
    public static char[][] rotateTheBox(char[][] box) {
        final char STONE = '#';
        final char EMPTY = '.';
        int n = box.length;
        int m = box[0].length;
        int empty;
        for (int i = 0; i < n; i++) {
            empty = m - 1;
            for (int j = m - 1; j >= 0; j--) {
                if (box[i][j] == STONE) {
                    box[i][j] = EMPTY;
                    box[i][empty] = STONE;
                    empty--;
                } else if (box[i][j] == '*') {
                    empty = j - 1;
                }

            }
        }
        char[][] res = new char[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res[j][n - i - 1] = box[i][j];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        rotateTheBox(new char[][]{{'#', '#', '#', '.', '.'}});
    }
}
