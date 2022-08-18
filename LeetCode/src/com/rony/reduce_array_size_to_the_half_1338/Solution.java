package com.rony.reduce_array_size_to_the_half_1338;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        int i = s.minSetSize(new int[]{3, 3, 3, 3, 5, 5, 5, 2, 2, 7});
        int j = s.minSetSize(new int[]{7,7,7,7,7,7});
        System.out.println(i);
        System.out.println(j);
    }

    public int minSetSize(int[] arr) {
        Map<Integer,Integer> counter = new HashMap<>();
        for(int i: arr){
            if(counter.containsKey(i)) counter.put(i,counter.get(i)+1);
            else counter.put(i,1);
        }
        List<Integer> list = new ArrayList<>();
        int total = 0;
        for(Map.Entry entry: counter.entrySet()){
//            System.out.println(entry.getKey()+" : "+entry.getValue()+" - ");
            list.add((Integer) entry.getValue());
            total += (Integer) entry.getValue();
        }
//        System.out.println();
        Collections.sort(list,Collections.reverseOrder());
        int count = 0;
        int left = total;
        for(int i: list){
            left -= i;
            count ++;
            if( left <= total/2){
                return count;
            }
        }
//        System.out.println();
        return count;
    }
}
