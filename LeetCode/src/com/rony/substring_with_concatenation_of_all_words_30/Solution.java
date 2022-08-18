package com.rony.substring_with_concatenation_of_all_words_30;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
//        s.findSubstring("barfoothefoobarman",  new String[]{"foo","bar"});
//        s.findSubstring("wordgoodgoodgoodbestword",  new String[]{"word","good","best","word"});
//        s.findSubstring("barfoofoobarthefoobarman",  new String[]{"bar","foo","the"});
        s.findSubstring("wordgoodgoodgoodbestword",  new String[]{"word","good","best","good"});
    }
    public List<Integer> findSubstring(String s, String[] words) {

        String revConcat = "";
        List<Integer> ints = new ArrayList<>();
        int times = words.length;
        res = new ArrayList<>(){};
        generatePermutationStringArray(words,0,times);
        for (String str: res) {
            if (s.contains(str) && !ints.contains(s.indexOf(str))) ints.add(s.indexOf(str));

        }
//        System.out.println(ints);
        return ints;
    }

    public static String swapString(String a, int i, int j) {
        char[] b =a.toCharArray();
        char ch;
        ch = b[i];
        b[i] = b[j];
        b[j] = ch;
        return String.valueOf(b);
    }

    //    public static void main(String[] args)
//    {
//        String str = "ABC";
//        int len = str.length();
//        System.out.println("All the permutations of the string are: ");
//        generatePermutation(str, 0, len);
//    }
    public String[] swapStringArray(String[] words, int i, int j){
        String temp = words[i];
        words[i] = words[j];
        words[j] =  temp;
        return words;
    }
    public static List<String> res =  new ArrayList<>();

    public void generatePermutationStringArray(String [] words, int start, int end){
        if (start == end-1) {
            String str = "";
            for (int i = 0; i < words.length; i++) str += words[i];
            res.add(str);
        }
        else
        {
            for (int i = start; i < end; i++)
            {
                //Swapping the string by fixing a character
                words = swapStringArray(words,start,i);
                //Recursively calling function generatePermutation() for rest of the characters
                generatePermutationStringArray(words,start+1,end);
                //Backtracking and swapping the characters again.
                words = swapStringArray(words,start,i);
            }
        }
    }

    public static void generatePermutation(String str, int start, int end)
    {
        //Prints the permutations
        if (start == end-1)
            System.out.println(str);
        else
        {
            for (int i = start; i < end; i++)
            {
                //Swapping the string by fixing a character
                str = swapString(str,start,i);
                //Recursively calling function generatePermutation() for rest of the characters
                generatePermutation(str,start+1,end);
                //Backtracking and swapping the characters again.
                str = swapString(str,start,i);
            }
        }
    }


}
//class PermuteString {
//    //Function for swapping the characters at position I with character at position j
//    public static String swapString(String a, int i, int j) {
//        char[] b =a.toCharArray();
//        char ch;
//        ch = b[i];
//        b[i] = b[j];
//        b[j] = ch;
//        return String.valueOf(b);
//    }
//
////    public static void main(String[] args)
////    {
////        String str = "ABC";
////        int len = str.length();
////        System.out.println("All the permutations of the string are: ");
////        generatePermutation(str, 0, len);
////    }
//    public String[] swapStringArray(String[] words, int i, int j){
//        String temp = words[i];
//        words[i] = words[j];
//        words[j] =  temp;
//        return words;
//    }
//    public static List<String> res =  new ArrayList<>();
//
//    public void generatePermutationStringArray(String [] words, int start, int end){
//        if (start == end-1) {
//            String str = "";
//            for (int i = 0; i < words.length; i++) str += words[i];
//            res.add(str);
//        }
//        else
//        {
//            for (int i = start; i < end; i++)
//            {
//                //Swapping the string by fixing a character
//                words = swapStringArray(words,start,i);
//                //Recursively calling function generatePermutation() for rest of the characters
//                generatePermutationStringArray(words,start+1,end);
//                //Backtracking and swapping the characters again.
//                words = swapStringArray(words,start,i);
//            }
//        }
//    }
//
//    public static void generatePermutation(String str, int start, int end)
//    {
//        //Prints the permutations
//        if (start == end-1)
//            System.out.println(str);
//        else
//        {
//            for (int i = start; i < end; i++)
//            {
//                //Swapping the string by fixing a character
//                str = swapString(str,start,i);
//                //Recursively calling function generatePermutation() for rest of the characters
//                generatePermutation(str,start+1,end);
//                //Backtracking and swapping the characters again.
//                str = swapString(str,start,i);
//            }
//        }
//    }
//}