package com.vantu.leetcode.Misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * LetterCombinationPhoneNumber
 *
 * @author Tu Tran
 * @version LetterCombinationPhoneNumber.java Nov 09 2021 14:25 tvtu
 * @desc: https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 **/
public class LetterCombinationPhoneNumber {
    public static List<String> letterCombinations(String digits) {
        List<Integer> ints = Arrays.stream(digits.split("")).map(Integer::parseInt).collect(Collectors.toList());
        List<String> result = new ArrayList<>();
        String[][] a = new String[10][4];
        a[2] = new String[]{"a", "b", "c", ""};
        a[3] = new String[]{"d", "e", "f", ""};
        a[4] = new String[]{"g", "h", "i", ""};
        a[5] = new String[]{"j", "k", "l", ""};
        a[6] = new String[]{"m", "n", "o", ""};
        a[7] = new String[]{"p", "q", "r", "s"};
        a[8] = new String[]{"t", "u", "v", ""};
        a[9] = new String[]{"w", "x", "y", "z"};



        return result;
    }

    public static void main(String[] args) {
        letterCombinations("123");
    }
}
