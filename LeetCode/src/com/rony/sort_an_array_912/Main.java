package com.rony.sort_an_array_912;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Arrays.stream(main.sortArray(new int[]{5, 2, 3, 1})).forEach(System.out::println);
    }
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int n: nums)
            pq.add(n);
        int[] ans = new int[nums.length];
        int i=0;
       while(!pq.isEmpty())
            ans[i++] = pq.poll();
        return ans;

    }

}
