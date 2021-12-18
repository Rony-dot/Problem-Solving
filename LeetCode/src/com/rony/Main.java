package com.rony;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.trailingZeroes(30));
    }
}

class Solution {
    public int trailingZeroes(int n) {
        // Factorial Trailing Zeroes
        int count = 0;
        while (n>0){
            n/=5;
            count += n;
        }
        return count;
    }
}
