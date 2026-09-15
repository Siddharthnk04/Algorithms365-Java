public class AverageCallsSum 
{
    int average(int[] arr)
    {
        int sum = sum(arr);
        return sum / arr.length;
    }

    int sum(int[] a)
    {
        int sum = 0;

        for (int i = 0; i < a.length; i++)
            sum += a[i];

        return sum;
    }

    public static void main(String[] args) 
    {
        int[] num = {10,20,30};

        AverageCallsSum ob = new AverageCallsSum();

        System.out.println(ob.average(num));
    }
}
