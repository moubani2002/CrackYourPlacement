//Best time to buy and sell stock


class Solution {
    public int maxProfit(int[] prices) {
        int maxprof = 0;
        for(int i=0;i<prices.length-1;i++){
            if ( prices[i] < prices[i+1] ) maxprof = maxprof - prices[i] + prices[i+1] ;
        }
        return maxprof;
    }
}