package com.rony.concatenation_of_array_1929;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int ans[] = sol.getConcatenation2(new int[] {1,2,3});
        Arrays.stream(ans).forEach(System.out::println);
    }
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int ans[] = new int[len*2];
        int limit = 2*len;
        for(int i=0; i<limit; i++){
            ans[i] = nums[i%len];
        }
        return ans;
    }
    public int[] getConcatenation2(int[] nums) {
        int len = nums.length;
        int ans[] = new int[len*2];
        int limit = 2*len;
        for(int i=0; i<len; i++){
            ans[i] = nums[i%len];
            ans[i+len] = ans[i];
        }
        return ans;
    }
}