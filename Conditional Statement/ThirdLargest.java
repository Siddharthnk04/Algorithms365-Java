public class ThirdLargest 
{
    static int findThirdLargest(int[] nums)
    {
        long max = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;

        for (int n : nums)
        {
            if (n > max)
            {
                max3 = max2;
                max2 = max;
                max = n;
            }
            else if (n < max && n > max2)
            {
                max3 = max2;
                max2 = n;
            }
            else if (n < max2 && n > max3)
            {
                max3 = n;
            }
        }

        if (max3 == Long.MIN_VALUE)
        {
            return (int)max;
        }

        return (int)max3;
    }
    
    public static void main(String[] args) 
    {
        int a[] = {3,2,1};

        System.out.println(findThirdLargest(a));
    }
}
