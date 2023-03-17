package com.rony.happy_number_202;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isHappy(19));
        System.out.println(solution.isHappy(2));

    }
    public boolean isHappy(int n) {
        int sum = n;
        Set<Integer> seen = new HashSet<Integer>();
//        seen.add(n);
        while(sum != 1 && !seen.contains(n)){
            seen.add(sum);
            sum = 0;
            for(; n!=0; n/=10){
                int rem = n%10;
                sum += rem*rem;
            }
            n = sum;
        }
        return sum==1 ? true : false;
    }

}
