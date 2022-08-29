package com.rony.ransom_note_383;


import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.canConstruct2("aaabb","aacbb");
    }

    public boolean canConstruct2(String ransomNote, String magazine) {
        char[] map = new char[26];
        for(char c : magazine.toCharArray()){
            map[c-'a'] += 1;
        }
        for(char c : ransomNote.toCharArray()){
            if(map[c-'a'] == 0){
                System.out.println("false");
                return  false;
            }
            map[c-'a'] -= 1;
        }
        System.out.println("true");
        return true;

    }


    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> count1 = new HashMap<>();
        Map<Character,Integer> count2 = new HashMap<>();
        for(char c: ransomNote.toCharArray()){
            count1.put(c,count1.containsKey(c) ? count1.get(c)+1 : 0);
        }
        for(char c: magazine.toCharArray()){
            count2.put(c,count2.containsKey(c) ? count2.get(c)+1 : 0);
        }
        for(char c: ransomNote.toCharArray()){
            if(!count1.containsKey(c) || !count2.containsKey(c)) return false;
            if(count1.get(c) > count2.get(c)){
                return false;
            }
        }

        return true;
    }
}