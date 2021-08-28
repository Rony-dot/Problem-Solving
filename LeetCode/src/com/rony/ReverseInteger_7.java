package com.rony;

public class ReverseInteger_7 {
    public static void main(String[] args) {
        ReverseInteger_7 rev = new ReverseInteger_7();
        ReverseInteger_7.Solution sol = rev.new Solution();
        System.out.println(sol.reverse(-2147483648));
    }

    class Solution {
        public int reverse(int x) {
//            long num = x;
//            boolean isNegative = false;
//            if(x<0){
//                isNegative = true;
//                num = -num;
//            }
            long rev = 0;
            while(x!=0){
                rev = rev*10 + x%10;
                x/=10;
            }
            if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE)
                return 0;
//            if(isNegative){
//                rev = -rev;
//            }
            return (int) rev;
        }
    }
}
