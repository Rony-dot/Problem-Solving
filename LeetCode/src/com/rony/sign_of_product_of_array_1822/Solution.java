package com.rony.sign_of_product_of_array_1822;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.arraySign(new int[]{-1,-2,-3,-4,-9,3,2,1}));
        System.out.println(solution.arraySign2(new int[]{-1,-2,-3,-4,-9,3,2,1}));
    }
    public int arraySign(int[] nums) {
        int sign = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0) return 0;
            if(nums[i] < 0) sign *= -1;
        }
        return sign;
    }

    public int arraySign2(int[] nums){
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0) return 0;
            if(nums[i]<0) count++;
        }
        return count % 2 == 0 ? 1 : -1;
    }

}
