public class SumArray 
{
    /*static int findSum(int[] arr)
    {
        int sum = 0;
        for (int x : arr)
        {
            sum += x;
        }

        return sum;
    }*/

    int findSum(int[] arr)
    {
        int sum = 0;
        for (int x : arr)
        {
            sum += x;
        }

        return sum;
    }

    public static void main(String[] args) 
    {
        int arr[] = {1, 3, 5, 7};

        SumArray obj = new SumArray();
        System.out.println(obj.findSum(arr));
    }
}
