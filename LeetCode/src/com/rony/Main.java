package com.rony;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.reverseString(new char[]{'h','e','l','l','o'});
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        /**
         * leetcode 14
         */
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
    public void reverseString(char[] s) {
        /**
         * reverseString = leetcode 344
         */
        int left = 0;
        int right = s.length - 1;
        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
    public double myPow(double x, int n) {
        /**
         * pow(X,N) = leetcode 50
         */
        double ans = 1.0;
        long num = n;
        if(n<0){
            num = -1 * num;
        }
        while(num>0){
            if(num%2==0){
                x = x * x;
                num = num / 2;
            }else {
                ans = ans * x;
                num = num - 1;
            }
        }
        if(n < 0 ){
            return (double) (1.0) / (double) ans;
        }
        return ans;
    }
    public int trailingZeroes(int n) {
        /**
         * Factorial Trailing Zeroes = leetcode 172
         *  counting the number of 5's in the number
         */
        int count = 0;
        while (n>0){
            n/=5;
            count += n;
        }
        return count;
    }
    public List<String> fizzBuzz(int n) {
        /**
         * fizz buzz = leetcode 412
         */
        List<String> result = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i%3==0 && i%5==0){
                result.add("FizzBuzz");
            }
            else if(i%3==0){
                result.add("Fizz");
            }else if(i%5==0){
                result.add("Buzz");
            }else {
                result.add(Integer.toString(i));
            }
        }
        return result;

    }
}
