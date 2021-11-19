package com.vantu.leetcode.String;

/**
 * CountAndSay
 *
 * @author Tu Tran
 * @version CountAndSay.java Nov 19 2021 15:32 tvtu
 * @desc: https://leetcode.com/problems/count-and-say/
 **/
public class CountAndSay {
    public static String countAndSay(int n) {
        String s = "1";
        for (int i = 0; i < n - 1; i++) {
            StringBuilder res = new StringBuilder("");
            int count = 1;
            char c = s.charAt(0);
            for (int j = 1; j < s.length(); j++) {
                if (s.charAt(j) == c) {
                    count++;
                } else {
                    res.append(count);
                    res.append(c);
                    c = s.charAt(j);
                    count = 1;
                }
            }
            res.append(count);
            res.append(c);
            s = res.toString();
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println(countAndSay(10));

    }
}
