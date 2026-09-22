public class Max 
{
    /*static int findMax(int[] arr)
    {
        int max = arr[0];
        for (int x : arr)
        {
            if (x > max)
            {
                max = x;
            }
        }

        return max;
    }*/

    int getMax(int[] arr)
    {
        int max = arr[0];
        for (int x : arr)
        {
            if (x > max)
            {
                max = x;
            }
        }

        return max;
    }

    public static void main(String[] args) 
    {
        int arr[] = {5, 10, 5, 6, 14, 8};

        Max obj = new Max();

        //System.out.println(findMax(arr));
        System.out.println(obj.getMax(arr));
    }
}
