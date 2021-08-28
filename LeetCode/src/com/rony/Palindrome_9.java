package com.rony;

public class Palindrome_9 {
    public static void main(String[] args) {
        Palindrome_9 p = new Palindrome_9();
        Palindrome_9.Solution sol = p.new Solution();
        System.out.println(sol.isPalindrome(-12321));

    }
    class Solution {
        public boolean isPalindrome(int x) {
            // if num is negative
            // if last digit is 0 and the number is not actually 0
            if(x<0 || (x%10==0 && x!=0))
                return false;
            int rev = 0;
            while(x>=rev){
                if(x == rev)
                    return true;
                rev = rev*10 + x%10;
                if(x == rev)
                    return true;
                x/=10;
            }
            return false;
        }
    }
}
