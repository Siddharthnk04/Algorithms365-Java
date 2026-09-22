public class SecondLargest 
{
    int getSecondLargest(int[] arr)
    {
        int largest = arr[0];
        int secondLargest = arr[0];

        for (int x : arr)
        {
            if (x > secondLargest)
            {
                if (x > largest)
                {
                    secondLargest = largest;
                    largest = x;
                }
                else
                {
                    secondLargest = x;
                }
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) 
    {
        SecondLargest obj = new SecondLargest();

        int arr[] = {10, 25, 2, 54, 84, 63};

        System.out.println(obj.getSecondLargest(arr));
    }
}
