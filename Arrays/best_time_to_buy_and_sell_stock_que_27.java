// Problem = Best Time to Buy and Sell Stock
// LeetCode Problem = 121
// Given an array 'prices', where prices[i] is the price of a given stock on the i-th day,
// find the maximum profit you can achieve from one transaction ( buy one and sell one share of the stock ).
// If you cannot achieve any profit, return 0.

public class best_time_to_buy_and_sell_stock_que_27 {

    public static int maxProfit(int[] prices) {
		
        // variable to store the minimum price ( best day to buy )
        int buy_price = Integer.MAX_VALUE;
        
        // variable to store the maximum profit found so far
        int max_profit = 0;

        // get total number of days
        int n = prices.length;

        // iterate through all days
        for (int i = 0; i < n; i++) {
            
            // if today's price is greater than the previous buy_price,
            // then selling today gives a profit.
           
		   if (buy_price < prices[i]) {  
                int profit = prices[i] - buy_price; // today's profit
                max_profit = Math.max(max_profit, profit); // update max profit if today's profit is greater
            } 
            else {
                // if today's price is lower than buy_price,
                // update buy_price because this is a better day to buy.
                buy_price = prices[i];
            }
        }

        // return the highest profit
        return max_profit;
    }

    /*
    explanation
    --> We want to buy at the lowest price and sell at the highest price after buying.
    --> As we move through the array:
        -> Keep track of the smallest value seen so far (buy_price).
        -> For each price, calculate profit = current_price - buy_price.
        -> Keep updating max_profit whenever we find a bigger profit.

    time complexity = O(n)
        -> We go through the array only once.

    space complexity = O(1)
        -> We use only a few variables, no extra data structures.
    */

    public static void main(String[] args) {
        // Example input: stock prices for each day
        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] prices_2 = {7, 6, 4, 3, 1};

        // call the maxProfit method for both examples
        int profit_1 = maxProfit(prices);
        int profit_2 = maxProfit(prices_2);

        // Display the results
        System.out.println("Maximum Profit (Example 1) : " + profit_1);
        System.out.println("Maximum Profit (Example 2) : " + profit_2);
    }
}

/* 
Output :

Maximum Profit (Example 1) : 5
Maximum Profit (Example 2) : 0

*/