class Solution {
    public int maxProfit(int[] prices) {
    //better approach
    //we need to keep track of the minimum price so far thats the buying day and then treat each day as a selling day Calculate profit Update max profit
    int minProfit = Integer.MAX_VALUE;
    int maxProfit =0;
    for(int i=0; i<prices.length; i++){
        if(prices[i] < minProfit){
            minProfit = prices[i];
        }else{
            int profit = prices[i] - minProfit;
            maxProfit = Math.max(profit, maxProfit);
        }
    }
return maxProfit;
    }
}
