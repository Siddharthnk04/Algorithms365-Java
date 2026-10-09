public class MaxSharesProfit 
{
    static int maxSharesProfit(int[] prices)
    {
        int profit = 0;
        int buyingPrice = prices[0];

        for (int i = 1; i < prices.length; i++)
        {
            if (prices[i] < buyingPrice)
            {
                buyingPrice = prices[i];
            }
            else
            {
                if (prices[i] - buyingPrice > profit)
                {
                    profit = prices[i] - buyingPrice;
                }
            }
        }

        return profit;
    }

    public static void main(String[] args) 
    {
        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println(maxSharesProfit(prices));
        
    }
}
