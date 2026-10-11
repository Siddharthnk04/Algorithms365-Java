public class MoneySavedFromBuyingSeperately 
{
    static int findMoneySavedFromBuyingCheaper(int[] shopA, int[] shopB)
    {
        // Question says Given prices of the same items at Shop A and Shop B
        if (shopA == null || shopB == null || shopA.length == 0)
            return -1;

        int moneySaved = 0;

        for (int i = 0; i < shopA.length; i++)
        {
            if (shopA[i] > shopB[i])
                moneySaved += (shopA[i] - shopB[i]);
        }

        return moneySaved;
    }

    public static void main(String[] args) 
    {
        int[] shopA = {100, 250, 80, 40};
        int[] shopB = {90, 260, 70, 45};

        System.out.println(findMoneySavedFromBuyingCheaper(shopA, shopB));
    }
}
