package com.rony.longest_substring_3;
import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int l = 0;
        int r = 0;
        Set<Character> charset = new HashSet<>();
        for(;r <s.length(); r++){
            while(charset.contains(s.charAt(r))){
                charset.remove(s.charAt(l));
                l += 1;
            }
            charset.add(s.charAt(r));
            res = Math.max(res, r - l + 1 );
        }

        return res;
    }
}
