package com.rony.length_of_last_word_58_easy;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLastWord2("Hello World"));
        System.out.println(solution.lengthOfLastWord2(""));
        System.out.println(solution.lengthOfLastWord2(" "));
        System.out.println(solution.lengthOfLastWord2("  Hello world  "));
    }

    public int lengthOfLastWord(String s) {
        if(s.length()==0) return 0;
        int charFound = 0;
        int lenOfLastWord = 0;
        char[] chars = s.toCharArray();
        for(int i=chars.length-1; i>=0; i--){
            if( chars[i] != ' ') {
                charFound = 1;
                lenOfLastWord++;
            } else if(chars[i]==' ' && charFound==1){
                break;
            }
        }
        return lenOfLastWord;
    }

    public int lengthOfLastWord2(String s){
        if(s.length()==0) return 0;
        int lenOfLastWord = 0;
        char[] chars = s.toCharArray();
        int i = s.length()-1;
        while( i>=0 && chars[i] == ' ' ) i--;
        while( i>=0  && chars[i] != ' ' ) {
            lenOfLastWord++;
            i--;
        }
        return lenOfLastWord;
    }
}
