package com.vantu.leetcode.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ReverseOnlyCharacter
 *
 * @author Tu Tran
 * @version ReverseOnlyCharacter.java Nov 11 2021 14:23 tvtu
 * @desc: https://leetcode.com/problems/reverse-only-letters/
 **/
public class ReverseOnlyCharacter {
    public static String reverseOnlyLetters(String s) {
        String[] arr = s.split("");
        int i = 0, j = arr.length - 1, n = s.length();
        while(i < j) {
            while (!Character.isLetter(arr[i].charAt(0)) && i < j) {
                i++;
            }
            if (i == n - 1) break;
            while (!Character.isLetter(arr[j].charAt(0)) && j > i) {
                j--;
            }
            if (j == 0) break;
            if (i < n && j >= 0) {
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else break;
        }
        String result = "";
        for (int k = 0; k < arr.length; k++) {
            result  = result + arr[k];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("tNH95P=TV"));

    }
}
