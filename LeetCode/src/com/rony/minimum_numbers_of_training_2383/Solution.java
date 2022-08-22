package com.rony.minimum_numbers_of_training_2383;

public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
//        sol.minNumberOfHours(5,3,new int[]{1,4,3,2}, new int[]{2,6,3,1});
//        sol.minNumberOfHours(5,3,new int[]{1,4}, new int[]{2,5});
//        sol.minNumberOfHours(2,4,new int[]{1}, new int[]{3});
        sol.minNumberOfHours(1,1,new int[]{1,1,1,1}, new int[]{1,1,1,50});
    }
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int hours = 0;
        int sumE = initialEnergy;
        for(int i=0; i<energy.length; i++){
            if(sumE <= energy[i]){
                int need = energy[i] -  sumE;
                hours += need+1;
                sumE += need+1;
                sumE -= energy[i];
            }else{
                sumE -= energy[i];
            }
        }
        System.out.println(hours);
        sumE = initialExperience;
        for(int i=0; i<experience.length; i++){
            if(sumE <= experience[i]){
                int need = experience[i] - sumE;
                sumE += need+1;
                hours += need+1;
            }else{
                sumE += experience[i];
            }
            System.out.println(sumE +" "  + " "+hours);
        }
        System.out.println(hours);
        System.out.println();
        return hours;

    }
}