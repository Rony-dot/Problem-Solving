package com.rony.find_occurance_28;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.strStr("sadbutsad","sad"));
        System.out.println(solution.strStr("butsad","sad"));
        System.out.println(solution.strStr("leetcode","leeto"));
        System.out.println(solution.strStr("mississippi","issipi"));
    }
    public  int strStr(String haystack, String needle) {
//        int result = -1;

        char[] str1 = haystack.toCharArray();
        char[] str2 = needle.toCharArray();
        if(str1.length<str2.length)
            return -1;
        for(int i=0; i<=str1.length-str2.length; i++){
            if(str1[i]==str2[0]){
                int j=1;
                for(;j<str2.length; j++){
                    if( str1[i+j]!=str2[j]) break;
                }
                if(j==str2.length) return i;
            }
        }

        return -1;
    }
}
