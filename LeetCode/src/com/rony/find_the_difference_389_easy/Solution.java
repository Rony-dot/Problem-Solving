package com.rony.find_the_difference_389_easy;

/**
 *   So, here also let's say our character are:
 *   s = abc
 *   t = cabx

 *   if we take XOR of every character. all the n character of s "abc" is similar to n character of t "cab". So, they will cancel each other.
 *   And we left with our answer.

 *   s =   abc
 *   t =   cbax
 *   ------------
 *   ans -> x
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findTheDifference("abcd","abfcd"));
    }


    public char findTheDifference(String s, String t) {
        char c = 0;
        for(int i=0; i<s.length(); i++){
            c ^= s.charAt(i);
        }
        for(int i=0; i<t.length(); i++){
            c ^= t.charAt(i);
        }
        return c;
    }
}
