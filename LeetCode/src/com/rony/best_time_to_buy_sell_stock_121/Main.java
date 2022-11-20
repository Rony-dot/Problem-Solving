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
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int maxP = 0;
        while(r < prices.length){
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
