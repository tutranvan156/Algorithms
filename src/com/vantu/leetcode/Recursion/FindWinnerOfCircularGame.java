package com.vantu.leetcode.Recursion;

/**
 * FindWinnerOfCircularGame
 *
 * @author Tu Tran
 * @version FindWinnerOfCircularGame.java Nov 17 2021 11:23 tvtu
 * @desc: https://leetcode.com/problems/find-the-winner-of-the-circular-game/
 **/
public class FindWinnerOfCircularGame {
    public static int findTheWinner(int n, int k) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = 1;
        }
        return find(arr, n, k, 0, n - 1);
    }
    public static int find(int[] arr, int n, int k, int begin, int count) {
        if (count == 0) {
            return begin + 1;
        }
        int pass = k - 1;
        for (int i = 1; i <= pass; i++) {
             if (arr[(begin + i) % n] == 0) {
                pass++;
            }
        }
        arr[(begin + pass) % n] = 0;
        while (arr[(begin + pass) % n]  == 0) {
            pass++;
        }
        begin = (begin + pass) % n;
        count--;
        return find(arr, n, k, begin, count);
    }

    public static void main(String[] args) {
        System.out.println(findTheWinner(5, 2));
    }
}
