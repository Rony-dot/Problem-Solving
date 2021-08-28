package com.rony;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger_13 {

    public static void main(String[] args) {
        RomanToInteger_13 rmt = new RomanToInteger_13();
        RomanToInteger_13.Solution sol = rmt.new Solution();
//        System.out.println(sol.romanToInt("MCMXCIV")); // 1994
        System.out.println(sol.romanToInt("VIII"));  //58
    }

    class Solution {
        public int romanToInt(String s) {
            Map<String,Integer> romanToInteger = new HashMap<>();
            romanToInteger.put("I",1);
            romanToInteger.put("V",5);
            romanToInteger.put("X",10);
            romanToInteger.put("L",50);
            romanToInteger.put("C",100);
            romanToInteger.put("D",500);
            romanToInteger.put("M",1000);
            int result = 0;
//            String ch = new String(s.charAt(s.length()-1)+"");
//            int prev = romanToInteger.get(ch);
            int prev = 0;
            for(int i = s.length()-1; i>=0 ; i--){
                String ch = new String(s.charAt(i)+"");
                int cur = romanToInteger.get(ch);

                if(prev==0) {
                    result += cur;
                    prev = cur;
                }
                else if(cur<prev){
                    result-=cur;
                    prev = cur;
                }else {
                    result+=cur;
                    prev = cur;
                }

            }

            return result;
        } // end function
    }// end class solution

}// end class main
