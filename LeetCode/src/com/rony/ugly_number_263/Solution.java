package com.rony.ugly_number_263;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isUglyy(1));
        System.out.println(solution.isUglyy(0));
        System.out.println(solution.isUglyy(6));
        System.out.println(solution.isUglyy(14));
    }

    public boolean isUgly(int n) {
        if (n <= 0) return false;
        while( n!= 1){
            if(n%2 == 0 ) n/=2;
            else if(n%3 == 0 ) n/=3;
            else if(n%5 == 0 ) n/=5;
            else break;
        }
        return n == 1;
    }

    public boolean isUglyy(int n){
        if (n<=0) return false;
        int[] arr = new int[]{2,3,5};
        for(int i=0; i<arr.length; i++){
            while( n % arr[i] == 0) n /= arr[i];
        }
        return n == 1;
    }
}
