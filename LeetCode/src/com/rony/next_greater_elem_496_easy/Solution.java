package com.rony.next_greater_elem_496_easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Arrays.stream(solution.nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2})).forEach(System.out::println);
        Arrays.stream(solution.nextGreaterElement(new int[]{2,4}, new int[]{1,2,3,4})).forEach(System.out::println);
        Arrays.stream(solution.nextGreaterElement(new int[]{1,3,5,2,4}, new int[]{6,5,4,3,2,1,7})).forEach(System.out::println);
    }


    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> maps = new HashMap<>();
        for(int i=0; i<nums1.length; i++){
            maps.put(nums1[i],i);
        }
        int[] res = new int[nums1.length];
        for(int i=0; i< nums2.length; i++){
            boolean found = false;
            if(maps.containsKey(nums2[i])){
                int j=i;
                while(j<nums2.length){
                    if(nums2[i] < nums2[j]) {
                        res[maps.get(nums2[i])] = nums2[j];
                        found = true;
                        break;
                    }
                    j++;
                }
                if(!found){
                    res[maps.get(nums2[i])] = -1;
                }
            }
        }
        return res;
    }

}
