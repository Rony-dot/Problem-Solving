package com.rony.subtract_the_product_and_sum_of_digits_1281;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.subtractProductAndSum(234));
        System.out.println(solution.subtractProductAndSum(4421));
    }
    public int subtractProductAndSum(int n) {

        int sum = 0, mul = 1;
        for(;n!=0;n/=10){
            int rem = n%10;
            sum += rem;
            mul *= rem;
        }

        return mul-sum;
    }
}
