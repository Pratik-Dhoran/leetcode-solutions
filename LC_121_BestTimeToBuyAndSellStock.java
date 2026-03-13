class Solution {
    public int maxProfit(int[] prices) {
        
        int maxprice = 0 ;
        int maxprofit = 0 ;

        for(int i = prices.length -1 ; 0 <= i ; i--)
        {
            if(prices[i] > maxprice)
            {
                maxprice = prices[i] ;
            }

            int profit = maxprice - prices[i] ;

            if(profit > maxprofit)
            {
                maxprofit = profit ;
            }
        }

        return maxprofit ;
    }
}
