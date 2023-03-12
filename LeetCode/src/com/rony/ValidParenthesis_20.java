package com.rony;

import java.util.*;

public class ValidParenthesis_20 {
    public static void main(String[] args) {
        ValidParenthesis_20 val = new ValidParenthesis_20();
        System.out.println(val.isValid( "]"));
        System.out.println(val.myIsValid( "]"));
        System.out.println(val.myIsValid2( "]"));
    }

    public boolean myIsValid(String s){
        Stack<Character> stak = new Stack<>();
        Map<Character,Character> brackets = new HashMap<>();
        brackets.put('(',')');
        brackets.put('{','}');
        brackets.put('[',']');
        for(Character c : s.toCharArray()){
            if (brackets.containsKey(c)){
                stak.push(brackets.get(c));
            }else if(!stak.isEmpty() && stak.peek() == c ){
               stak.pop();
            }else{
                return false;
            }
        }
        return stak.isEmpty();
    }

    public boolean myIsValid2(String s){
        Stack<Character> stak = new Stack<>();
        Map<Character,Character> brackets = new HashMap<>();
        brackets.put(')','(');
        brackets.put('}','{');
        brackets.put(']','[');
        for(Character c : s.toCharArray()){
            if (brackets.containsKey(c) && !stak.isEmpty() && stak.peek() == brackets.get(c)) {
                stak.pop();
            }else{
                stak.push(c);
            }
        }
        return stak.isEmpty();
    }

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
            else if(stack.isEmpty() || stack.pop() != c ){
                return false;
            }
        }
        return stack.isEmpty();
    }

}
