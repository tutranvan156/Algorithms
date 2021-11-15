package com.vantu.leetcode.DataStruct.Stack;

import javafx.stage.Stage;

import java.util.Stack;

/**
 * Create by TranVanTu on 11/13/2021 8:02 AM
 * Desc: https://leetcode.com/problems/valid-parentheses/
 **/
public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (st.isEmpty()) {
                st.push(s.charAt(i));
            } else {
                char temp = st.peek();
                if ((temp == '[' && s.charAt(i) == ']') || (temp == '(' && s.charAt(i) == ')') || (temp == '{' && s.charAt(i) == '}')) {
                    st.pop();
                } else st.push(s.charAt(i));
            }
        }
        return st.isEmpty() ? true : false;
    }
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }

}
