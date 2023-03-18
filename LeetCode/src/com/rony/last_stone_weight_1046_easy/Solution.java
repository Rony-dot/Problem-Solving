package com.rony.last_stone_weight_1046_easy;

import java.util.PriorityQueue;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lastStoneWeight(new int[]{2,7,4,1,8,1}));
        System.out.println(solution.lastStoneWeight(new int[]{2,7,4,1,8,1,1}));
        System.out.println(solution.lastStoneWeight(new int[]{1}));
    }
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(stones.length, (a,b) -> b-a);
        for(int i=0; i<stones.length; i++){
            pq.add(stones[i]);
        }
        while(pq.size() > 1){
            int a = pq.poll();
            int b = pq.poll();
            if(a != b) pq.add(a-b);
        }
        return pq.isEmpty() ? 0 : pq.poll();
    }
}
