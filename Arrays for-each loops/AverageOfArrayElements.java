public class AverageOfArrayElements 
{
    double average(int[] arr)
    {
        int sum = sum(arr);

        return sum / arr.length;
    }

    int sum(int arr[])
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
        AverageOfArrayElements obj = new AverageOfArrayElements();

        int arr[] = {12, 10, 54, 24, 60};

        System.out.println(obj.average(arr));
    }
}
