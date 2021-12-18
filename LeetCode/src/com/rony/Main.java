package com.rony;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.myPow(2.00000,-2147483648));
    }
}

class Solution {
    public double myPow(double x, int n) {
        /**
         * pow(X,N)
         */
        double ans = 1.0;
        long num = n;
        if(n<0){
            num = -1 * num;
        }
        while(num>0){
            if(num%2==0){
                x = x * x;
                num = num / 2;
            }else {
                ans = ans * x;
                num = num - 1;
            }
        }
        if(n < 0 ){
            return (double) (1.0) / (double) ans;
        }
        return ans;
    }
    public int trailingZeroes(int n) {
        /**
         * Factorial Trailing Zeroes
         *  counting the number of 5's in the number
         */
        int count = 0;
        while (n>0){
            n/=5;
            count += n;
        }
        return count;
    }
    public List<String> fizzBuzz(int n) {
        /**
         * fizz buzz
         */
        List<String> result = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i%3==0 && i%5==0){
                result.add("FizzBuzz");
            }
            else if(i%3==0){
                result.add("Fizz");
            }else if(i%5==0){
                result.add("Buzz");
            }else {
                result.add(Integer.toString(i));
            }
        }
        return result;

    }
}
