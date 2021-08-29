package com.rony;

import java.util.*;

public class ValidParenthesis_20 {
    public static void main(String[] args) {
        ValidParenthesis_20 val = new ValidParenthesis_20();
        ValidParenthesis_20.Solution sol = val.new Solution();
        System.out.println(sol.isValid( "[]"));
    }

    class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            for(char c : s.toCharArray()){
                if(c == '('){
                    stack.push(')');
                }else if(c == '{'){
                    stack.push('}');
                }else if(c == '['){
                    stack.push(']');
                }
                else if(stack.isEmpty() || stack.pop()!= c){
                    return false;
                }
            }
            return stack.isEmpty();
        }
    }
}
