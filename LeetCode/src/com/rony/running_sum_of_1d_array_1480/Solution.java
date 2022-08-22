package com.rony.running_sum_of_1d_array_1480;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] ints = sol.runningSum(new int[]{1, 2, 3, 4});
        Arrays.stream(ints).forEach(System.out::println);
    }
    public int[] runningSum(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        int sum = 0;
        for(int i=0; i<len; i++){
            ans[i] = sum += nums[i];
        }
        return ans;
    }
}