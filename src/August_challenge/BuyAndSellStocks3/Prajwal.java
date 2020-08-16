class Solution
{
    public int maxProfit(int[] prices)
    {
        if(prices == null || prices.length < 1)
            return 0;

        int First_buy = -prices[0], First_sell = 0, Second_buy = -prices[0], Second_sell = 0;

        for( int i = 1; i < prices.length; i++)
        {
            First_buy = Math.max(First_buy, -prices[i]);   // -1

            First_sell = Math.max(First_sell, First_buy + prices[i]); // 1

            Second_buy = Math.max(Second_buy, First_sell - prices[i]); // max ( -1, 1 - 2) -1

            Second_sell = Math.max(Second_sell, Second_buy + prices[i]); // max(0, -1 + 2) 1

        }

        return Second_sell;
    }
}