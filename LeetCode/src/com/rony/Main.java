package com.rony;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseWords("the hi      is blue"));
    }
}

class Solution {
    public String longestPalindrome(String s) {
        //5
        // manacher's algorithm = linear time
        return "";
    }

    public String reverseWords(String s) {
        // 151
        StringBuffer sb = new StringBuffer();

        int i = s.length() - 1;

        while (i >= 0) {
            if (s.charAt(i) == ' ') {
                i--;
            } else {
                int j = i;
                while (i >= 0 && s.charAt(i) != ' ') {
                    i--;
                }
                if (sb.length() > 0) {
                    sb.append(' ');
                }
                for (int k = i + 1; k <= j; k++) {
                    sb.append(s.charAt(k));
                }
            }
        }

        return sb.toString();
    }
    public String reverseWords2(String s) {
        //151
        int i = s.length()-1;
        StringBuffer sb = new StringBuffer();
        if(s.charAt(i) == ' '){
            i--;
        }
            int j = i;
            while(i>-1){
                if(s.charAt(i)!=' ' && i!=0){
                    i--;
                }else {
                    if(sb.length()>0){
                        sb.append(' ');
                    }
                    while(s.charAt(i)==' '){
                        i--;
                    }
                    i++;
                    int k = s.charAt(i)==' ' ? i+1 : i;
                    for(; k<=j; k++){
                        sb.append(s.charAt(k));
                    }
                    i--;
                    j = i;
                }
            }
        return sb.toString();
    }
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
