public class Count 
{
    /*int countPositive(int[] arr)
    {
        int count = 0;

        for (int x : arr)
        {
            if (x > 0)
            {
                count++;
            }
        }
        return count;
    }

    int countNegative(int[] arr)
    {
        int count = 0;

        for (int x : arr)
        {
            if (x < 0)
            {
                count++;
            }
        }
        return count;
    }

    int countZero(int[] arr)
    {
        int count = 0;

        for (int x : arr)
        {
            if (x == 0)
            {
                count++;
            }
        }
        return count;
    }*/

    void countNumber(Numbers obj, int[] arr)
    {
        for (int x : arr)
        {
            if (x > 0)
            {
                obj.positive++;
            }
            else if (x < 0)
            {
                obj.negative++;
            }
            else
            {
                obj.zeros++;
            }
        }
    }

    public static void main(String[] args) 
    {
        // Count obj = new Count();

        // int arr[] = {10, -2, 0, 5, 6, -78, 0, 0, 85, -23};

        // System.out.println("Positive : " + obj.countPositive(arr));
        // System.out.println("Negative : " + obj.countNegative(arr));
        // System.out.println("Zero : " + obj.countZero(arr));

        Numbers obj = new Numbers();
        Count object = new Count();

        int[] arr = {10, -2, 0, 5, 6, -78, 0, 0, 85, -23};
        
        object.countNumber(obj, arr);

        System.out.println("Positive : " + obj.positive);
        System.out.println("Negative : " + obj.negative);
        System.out.println("Zero : " + obj.zeros);
    }
}

class Numbers
{
    public int positive = 0;
    public int negative = 0;
    public int zeros = 0;
}
