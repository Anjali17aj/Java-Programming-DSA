/*121. Best Time to Buy and Sell Stock -LeetCode Easy 
Problem statement: You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0  


Example 1: //test cases
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

Example 2:
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.

*/

import java.util.*; 

public class solution{
    public static int BuySellStocks(int prices[]){
        int buyStockPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0; i<prices.length; i++){
            if(buyStockPrice < prices[i]){ //buyStockPriceis buying priceo of yesterday and prices[i]is selling price of today. Here we get Profit. 
                int Profit = prices[i]- buyStockPrice; //todays's profit.
                maxProfit=Math.max(maxProfit, Profit); //maximum profit till today is maxProfit , Today's maximum profit calculated is Profit.
            } else {
                buyStockPrice = prices[i]; //Condition: if today's selling price is less than the buying price of yesterday then its better to buy a stock rather than selling it so that in future price will be high so we will be able to sell it then only we will make profit. don't sell it today.
            }
        
        }
        return maxProfit;

    }
    public static void main(String args[]){
        int prices[]={ 7,1,5,3,6,4}; // O(n)
        System.out.println(BuySellStocks(prices));
    }
}