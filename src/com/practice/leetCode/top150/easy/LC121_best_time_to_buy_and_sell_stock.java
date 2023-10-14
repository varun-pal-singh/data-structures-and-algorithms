package com.practice.leetCode.top150.easy;

/**
 * You are given an array prices where prices[i] is the price
 * of a given stock on the ith day.

 * You want to maximize your profit by choosing a single day
 * to buy one stock and choosing a different day in the future
 * to sell that stock.

 * Return the maximum profit you can achieve from this
 * transaction. If you cannot achieve any profit, return 0.

 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5
 * (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not
 * allowed because you must buy before you sell.

 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the
 * max profit = 0.

 * Constraints:
 * 1 <= prices.length <= 105
 * 0 <= prices[i] <= 104
 */
public class LC121_best_time_to_buy_and_sell_stock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4}, prices1 = {7,6,4,3,1};
        System.out.println("max profits for prices : "+maxProfitNaive(prices)+" and for prices1 : "+maxProfitNaive(prices1));
        System.out.println();
        System.out.println("max profits for prices : "+maxProfitOptimal(prices)+" and for prices1 : "+maxProfitOptimal(prices1));
    }
    public static int maxProfitNaive(int[] prices) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < prices.length - 1; i++){
            for(int j = i + 1; j < prices.length; j++){
                max = Math.max(prices[j] - prices[i], max);
            }
        }
        return Math.max(max, 0);
    }
    public static int maxProfitOptimal(int[] prices){
//         prices = {7,1,5,3,6,4}
        int currProfit = 0, maxProfit = 0;
        int currBuying = prices[0];
        for(int currPrice : prices){
            if(currPrice < currBuying){
                currBuying = currPrice;
            }else{
                currProfit = currPrice - currBuying;
            }
            if(maxProfit < currProfit){
                maxProfit = currProfit;
            }
        }
        return maxProfit;
    }
}
