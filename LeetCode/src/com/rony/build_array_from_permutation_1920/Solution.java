package com.rony.build_array_from_permutation_1920;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] ints = sol.buildArray(new int[]{0, 2, 1, 5, 3, 4});
        Arrays.stream(ints).forEach(System.out::print);
        System.out.println();
        ints = sol.buildArray(new int[] {5,0,1,2,3,4});
        Arrays.stream(ints).forEach(System.out::print);


    }
    public int[] buildArray(int[] nums) {
        int len = nums.length;
        int [] results = new int[len];
        for(int i=0; i< len; i++){
            results[i] = nums[nums[i]];
        }

        return results;
    }
}
