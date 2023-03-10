package com.rony.best_time_to_buy_sell_stock_121;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(solution.maxProfit(new int[]{7,6,4,3,1}));
    }
}


class Solution {
// TODO: time O(n) cause even though we have two pointers we actually traverse the array only once
// TODO: space O(1) cause we only used some pointer,
    public int maxProfit(int[] prices) {
        int l = 0;  // left=buy
        int r = 1;  // right=sell
        int maxP = 0;
        while(r < prices.length){
            // profitable ?
            if(prices[l]<prices[r]){
                int profit = prices[r] - prices[l];
                maxP = Math.max(profit,maxP);
            }else {
                l = r;
            }
            r += 1;
        }
        return maxP;
    }
}
