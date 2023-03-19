package com.rony.reverse_bits_190_easy;

/**
 *      assume an 4 bit integer
 *      0101  = 5 ; before reversing
 *      1010 = 10 ;  after reversing the whole 4 bits
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverse_4_Bits(5)); // print 10
    }


    public int reverse_4_Bits(int n) {
        int ans = 0;
        for(int i=0; i<4; i++){
            ans <<= 1;
            ans = ans | (n&1);
            n >>= 1;
        }
        return ans;
    }

    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ans = 0;
        for(int i=0; i<32; i++){
            ans <<= 1;
            ans = ans | (n&1);
            n >>= 1;
        }
        return ans;
    }
}
