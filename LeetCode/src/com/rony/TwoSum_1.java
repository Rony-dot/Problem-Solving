package com.rony;

public class TwoSum_1 {

//    Input: nums = [2,7,11,15], target = 9
//    Output: [0,1]
//    Output: Because nums[0] + nums[1] == 9, we return [0, 1].

    public static void main(String[] args) {
         // of size 3
//        int[] arr = new int[3];

        // declaration and instantiation
//        int[] arr = {1,3,4}

        // anonymous array
//        new int[] {1,2,3}

        int[] nums = {2,7,11, 15};
        int target = 26;
        Solution s = new Solution();
        int[] results = s.twoSum(nums, target);
        System.out.println(results[0]+" , "+results[1]);
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] results = new int[2];
        for(int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]== target){
                    results[0] = i;
                    results[1] = j;
                    return results;
                }
            }
        }
        return results;
    }
}
