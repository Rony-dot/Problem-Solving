package com.rony.can_make_artihmatic_program_from_sequence_1502;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canMakeArithmeticProgression(new int[]{3,5,1}));
        System.out.println(solution.canMakeArithmeticProgression(new int[]{1,2,4}));
        System.out.println(solution.canMakeArithmeticProgression(new int[]{1,3,5}));
    }
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[0] - arr[1];
        for(int i=0; i<arr.length-1; i++){
            int diff2 = arr[i] - arr[i+1];
            if(diff != diff2) return false;
        }
        return true;
    }
}
