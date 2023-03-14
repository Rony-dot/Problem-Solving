package com.rony.largest_perimeter_triangle_976;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.largestPerimeter(new int[]{2,1,2}));
        System.out.println(solution.largestPerimeter(new int[]{1,2,1,10}));
    }

    public int largestPerimeter(int[] nums) {
        int maxP = 0;
        Arrays.sort(nums);
        for(int i=0; i<= nums.length-3; i++){
            int a = nums[i];
            int b = nums[i+1];
            int c = nums[i+2];
            if( a+b > c ){
                maxP = Math.max(maxP,a+b+c);
            }
        }

        return maxP;
    }

}
