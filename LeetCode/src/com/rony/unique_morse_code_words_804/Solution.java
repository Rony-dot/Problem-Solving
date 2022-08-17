package com.rony.unique_morse_code_words_804;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.uniqueMorseRepresentations(new String[] {"gin","zen","gig","msg"});
    }
    public int uniqueMorseRepresentations(String[] words) {
        List<String> stringList = Arrays.asList(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..");
        Set<String> uq = new HashSet<>();
        for(String s : words){
            char[] chars = s.toCharArray();
            String str = "";
            for(int i=0; i<chars.length; i++){
                str += stringList.get(chars[i]-'a');
            }
            uq.add(str);
        }

        return uq.size();
    }
}
