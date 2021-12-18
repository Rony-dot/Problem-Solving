package com.rony;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.fizzBuzz(5));
    }
}

class Solution {
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
