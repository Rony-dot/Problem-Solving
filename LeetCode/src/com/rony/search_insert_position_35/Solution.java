package com.rony.search_insert_position_35;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(1/2);
        System.out.println(solution.searchInsert(new int[]{1,3,5,6},0));
        System.out.println(solution.binarySearchInsert(new int[]{1,3,5,6},0));
    }
    public int binarySearchInsert(int[] nums, int target){
        int lo = 0;
        int hi = nums.length-1;
        int mid = 0;
        while(lo<=hi){
//            mid = (lo+hi)/2;
            mid = (lo+hi) >>> 1; //same as divide by 2
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                lo = mid+1;
            }else{
                hi = mid-1;
            }
        }
        return lo;
    }
    public int searchInsert(int[] nums, int target) {

        for(int i=0; i<nums.length; i++){
            if(nums[i]==target) return i;
            else if(nums[i]>target) return i;
        }
        return nums.length;
    }


}
