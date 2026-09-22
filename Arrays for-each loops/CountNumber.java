public class CountNumber 
{
    int count(int[] arr, int num)
    {
        int count = 0;
        for (int x : arr)
        {
            if (x == num)
            {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) 
    {
        CountNumber obj = new CountNumber();

        int[] arr = {1, 2, 3, 1, 2, 0, 1, 5, 1, 8, 1};

        System.out.println(obj.count(arr, 1));
    }
}
