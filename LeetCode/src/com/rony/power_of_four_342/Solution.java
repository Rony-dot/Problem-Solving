package com.rony.power_of_four_342;

public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        boolean powerOfFour = sol.isPowerOfFour(-2147483648);
        System.out.println(powerOfFour);
    }
    public boolean isPowerOfFour(int n) {
        if(n<1) return false;
        for(int i=0; i<32; i+=2){
            if(n == (1<<i)){
                return true;
            }
        }
        return false;
    }
}
