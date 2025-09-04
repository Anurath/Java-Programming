class LeetCodeSolution_Q121 {
    public int maxProfit(int[] prices) {
         int minBuy = 2147463648;
        int maxProfit = 0;

        for(int i=0;i<prices.length;i++)
        {
            if(i!=0)
            {
                if(maxProfit<(prices[i]-minBuy))
                {
                    maxProfit = prices[i]-minBuy;
                }
            }
            if(minBuy>prices[i])
            {
                minBuy = prices[i];
            }
        }
        return maxProfit;
    }
}