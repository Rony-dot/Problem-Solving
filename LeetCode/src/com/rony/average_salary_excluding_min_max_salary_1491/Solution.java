package com.rony.average_salary_excluding_min_max_salary_1491;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.average(new int[]{4000,3000,1000,2000}));
    }

    public double average(int[] salary) {
        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;
        double avg = 0, sum = 0;
        for(int i=0; i<salary.length; i++){
            sum += salary[i];
            if(salary[i] <= min) min = salary[i];
            if(salary[i] >= max) max = salary[i];
        }

        return (sum-min-max)/(salary.length-2);
    }
}
