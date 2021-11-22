package com.vantu.leetcode.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * GroupAnagrams
 *
 * @author Tu Tran
 * @version GroupAnagrams.java Nov 22 2021 15:15 tvtu
 * @desc: https://leetcode.com/problems/group-anagrams/
 **/
public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ch = new char[26];
            int n = s.length();
            for (int i = 0; i < n; i++) {
                ch[s.charAt(i) - 'a']++;
            }
            String keyStr = String.valueOf(ch);
            if (!map.containsKey(keyStr)) {
                map.put(keyStr, new ArrayList<>());
            }
            map.get(keyStr).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }

}
