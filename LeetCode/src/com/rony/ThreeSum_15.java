package com.rony;

import java.util.*;

/**
 * -------------------------------time limit exceeded-----------------------
 */

public class ThreeSum_15 {
    public static void main(String[] args) {
       ThreeSum_15 s = new ThreeSum_15();
       // creating an inner class
       ThreeSum_15.Solution sol = s.new Solution();
        int [] nums = {-1,0,1,2,-1,-4};
//        int [] nums = {0};
        System.out.println(sol.threeSum(nums));


    }
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            // initialize a list
//            List<String> cities = new ArrayList() {{
//                add("New York");
//                add("Rio");
//                add("Tokyo");
//            }};
//            three more ways below
//            List<String> list = Arrays.asList("foo", "bar");
//            List<String> list = List.of("foo", "bar");
//            Set<String> set = Set.of("foo", "bar");
            ArrayList<List<Integer>> list = new ArrayList<>();

            if(nums.length<=2 || nums == null){
                return list;
            }

            Set<List<Integer>> set = new HashSet<>();
            int len = nums.length;
            for(int i=0; i<len-2; i++){
                for (int j=i+1; j<len-1; j++){
                   for(int k = j+1; k<len; k++){
                       if(nums[i]+nums[j]+nums[k]==0){
                           List<Integer> integerList = Arrays.asList(nums[i], nums[j], nums[k]);
                           Collections.sort(integerList);
                           set.add(integerList);
                           // same work
//                           list.add(Arrays.asList(nums[i], nums[j], nums[k]));
                       }
                   }
                }
            }
            list.addAll(set);
            return list;
      }
    }
}


