package com.rony.search_insert_position_35;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
    }

    public int searchInsert(int[] nums, int target) {

        for(int i=0; i<nums.length; i++){
            if(nums[i]==target) return i;
            else if(nums[i]>target) return i;
        }
        return nums.length;
    }
}
