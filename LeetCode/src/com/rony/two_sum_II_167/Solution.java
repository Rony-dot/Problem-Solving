package com.rony.two_sum_II_167;

import java.util.Arrays;
//TODO: Solved with two pointers time O(n) and space O(n) size of the array
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    public int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        int itr = 0, i=0, j=numbers.length-1;
        while( itr++ < numbers.length){
            int value = numbers[i]+numbers[j];
            if(value<target){
                i++;
            }else if(value>target){
                j--;
            }else {
                arr[0] = i+1;
                arr[1] = j+1;
                break;
            }
        }
        return arr;
    }


}
