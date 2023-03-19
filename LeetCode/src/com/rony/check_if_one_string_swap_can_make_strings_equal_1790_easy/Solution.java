package com.rony.check_if_one_string_swap_can_make_strings_equal_1790_easy;

import java.util.ArrayList;
import java.util.List;


/**
 *          str1 = "bank"
 *          str2 = "kanb"
 *          mismatch_idx = 0,3
 *          need only one char swap, means two idx swap, then true else false
 *     if   str1[0] == str2[3] && str1[3] == str2[0]
 *             b    ==   b     &&    k    ==    k
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.areAlmostEqual("bank","kanb"));
        System.out.println(solution.areAlmostEqual("bank","bank"));
        System.out.println(solution.areAlmostEqual("aa","ac"));
    }
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1 == null || s2 == null) return false;
        if(s1.length() != s2.length()) return false;
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<s1.length(); i++){
            if(str1[i] != str2[i]) {
                list.add(i);
            }
        }
        if(list.size() == 2 ){
            if( str1[list.get(0)] == str2[list.get(1)] && str1[list.get(1)] == str2[list.get(0)] ){
                return true;
            }
        }
        return list.isEmpty();
    }

}
