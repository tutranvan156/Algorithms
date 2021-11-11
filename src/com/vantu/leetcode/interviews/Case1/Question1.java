package com.vantu.leetcode.interviews.Case1;

import com.sun.deploy.panel.JreTableModel;

import java.util.Arrays;
import java.util.List;

/**
 * Question1
 *
 * @author Tu Tran
 * @version Question1.java Nov 11 2021 09:19 tvtu
 * @desc:
 **/
public class Question1 {
    public static String mostCommonWord(String paragraph, String banned) {
        List<String> list = Arrays.asList(paragraph.toLowerCase().split("[,. ]"));
        for (String item: list) {
            if (item == " ")  {
                list.remove(item);
            }
        }
        System.out.println(list);
        return null;
    }

    public static void main(String[] args) {
        mostCommonWord("Bob hit a ball , the hit BALL flew far after it was hit.", "123");
    }
}
