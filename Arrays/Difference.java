public class Difference 
{
    static int findDifferenceBetweenLargestAndSmallest(int[] arr)
    {
        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] > largest)
                largest = arr[i];

            if (arr[i] < smallest)
                smallest = arr[i];
        }

        return largest - smallest;
    }

    public static void main(String[] args) 
    {
        int[] arr = {4, 10, 26, 1, 5};

        System.out.println(findDifferenceBetweenLargestAndSmallest(arr));
    }
}
