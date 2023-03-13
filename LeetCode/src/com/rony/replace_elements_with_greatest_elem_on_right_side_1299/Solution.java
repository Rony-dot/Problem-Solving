package com.rony.replace_elements_with_greatest_elem_on_right_side_1299;

import java.util.Arrays;
/**
 *  TODO if you traverse the array in reverse order, it can be solved in O(n)
 * Input: arr = [17,18,5,4,6,1]
 * Output: [18,6,6,6,1,-1]
 * Explanation:
 * - index 0 --> the greatest element to the right of index 0 is index 1 (18).
 * - index 1 --> the greatest element to the right of index 1 is index 4 (6).
 * - index 2 --> the greatest element to the right of index 2 is index 4 (6).
 * - index 3 --> the greatest element to the right of index 3 is index 4 (6).
 * - index 4 --> the greatest element to the right of index 4 is index 5 (1).
 * - index 5 --> there are no elements to the right of index 5, so we put -1.
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.replaceElements(new int[]{17, 18, 5, 4, 6, 1})));
    }
    public int[] replaceElements(int[] arr) {
        int len = arr.length;
        int[] result = new int[len];
        int greatest = -1;
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]>=greatest){
                result[i] = greatest;
                greatest = arr[i];
            }else{
                result[i] = greatest;
            }
        }

        return result;
    }
}
