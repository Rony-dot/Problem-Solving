package com.rony.number_od_1_bits_191;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.hammingWeight(00000000000000000000000000001011));
    }
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        while(n != 0){
            int lastBit = n & 1; // returns 1 or 0
            n = n >>> 1; // right shift 1 bit
            count += lastBit; // increment count with 1 or 0
        }
        return count;
    }
}
