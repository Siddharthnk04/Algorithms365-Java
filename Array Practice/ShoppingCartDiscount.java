public class ShoppingCartDiscount 
{
    static double findTotalPrice(int[] prices)
    {
        if (prices == null || prices.length == 0)
            return -1;

        double totalPrice = 0;
        
        for (int x : prices)
            totalPrice += x;

        if (totalPrice < 1000)
            return totalPrice;

        return totalPrice - (totalPrice / 10);
    }

    public static void main(String[] args) 
    {
        int[] prices = {400, 350, 450};

        System.out.println(findTotalPrice(prices));
    }
}
