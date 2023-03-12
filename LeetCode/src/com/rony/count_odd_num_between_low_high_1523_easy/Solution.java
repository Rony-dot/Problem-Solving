package com.rony.count_odd_num_between_low_high_1523_easy;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countOdds(3,7));
    }

    public int countOdds(int low, int high) {

        // Initialize odd with the number of even numbers between low and high.
        int odd = (high - low) / 2;

        // If either low or high is odd, increment odd by 1.
        if (low % 2 == 1 || high % 2 == 1) {
            odd++;
        }

        // Return the number of odd numbers between low and high.
        return odd;

    }
}
