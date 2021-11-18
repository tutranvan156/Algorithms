package com.vantu.leetcode.Backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Create by TranVanTu on 11/13/2021 3:42 PM
 * Desc: https://leetcode.com/problems/generate-parentheses/
 **/
public class GenerateParentheses {
    public static List<String> generateParenthesis(int n) {
        n = n * 2;
        char[] gen = {'(', ')'};
        char[] c = new char[n];
        List<String> result = new ArrayList<>();
        Try(gen, result, n, c, 0);
        System.out.println(result);
        return result;
    }

    public static void Try(char[] gen, List<String> result, int n, char[] s, int count) {
        if (count == n) {
            if (checkValid(s)) {
                result.add(String.valueOf(s));
            }
            return;
        }
        for (int i = 0; i < 2; i++) {
            s[count] = gen[i];
            count++;
            Try(gen, result, n, s, count);
            count--;
        }
    }

    public static boolean checkValid(char[] s) {
        Stack<Character> characters = new Stack<>();
        for (int i = 0; i < s.length; i++) {
            if (characters.isEmpty()) {
                characters.push(s[i]);
            } else {
                if ((characters.peek() == '(') && (s[i] == ')')) {
                    characters.pop();
                } else characters.push(s[i]);
            }
        }
        return characters.isEmpty();
    }

    public static void main(String[] args) {
        generateParenthesis(3);
    }
}
