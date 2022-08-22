package com.rony.longest_common_prefix_14;

public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = sol.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        System.out.println(s);
    }
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        if(strs.length == 0 || strs == null){
            return result;
        }

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