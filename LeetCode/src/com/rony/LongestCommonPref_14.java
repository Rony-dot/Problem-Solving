package com.rony;

public class LongestCommonPref_14 {

    public static void main(String[] args) {
        LongestCommonPref_14 lcf = new LongestCommonPref_14();
        LongestCommonPref_14.Solution sol = lcf.new Solution();
        System.out.println(sol.longestCommonPrefix(new String[]{"ab","a"}));

    }

    class Solution {
        public String longestCommonPrefix(String[] strs) {
            String result = "";
            if(strs.length == 0 || strs == null){
                return result;
            }
            String cmp = strs[0];

            int minLen = strs[0].length();
            for(String s: strs){
                minLen = Math.min(minLen,s.length());
            }

            for(int i =0; i<minLen; i++){
                char cur = strs[0].charAt(i);
                for(String s: strs){
                    if(cur != s.charAt(i)){
                        return result;
                    }
                }
                result+=cur;
            }

            return result;
        }
    }
}
