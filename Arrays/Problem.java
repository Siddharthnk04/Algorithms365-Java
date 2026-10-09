import java.util.Arrays;

public class Problem 
{
    static void compareElements(int[] arr)
    {
        if (arr == null)
        {
            System.out.println("null");
            return;
        }

        if (arr.length == 0)
        {
            System.out.println("Array is Empty!!");
            return;
        }

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                if (i != j)
                {
                    if (arr[i] == arr[j])
                        System.out.println(arr[i] + "==" + arr[j]);
                    else if (arr[i] > arr[j])
                        System.out.println(arr[i] + ">" + arr[j]);
                    else
                        System.out.println(arr[i] + "<" + arr[j]);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
        int[] arr = {10, 20, 30, 40};
        int[] array = {10, 20, 30, -10, 10, 30, 40};

        System.out.println(Arrays.toString(arr));
        compareElements(arr);
        System.out.println();
        System.out.println(Arrays.toString(array));
        compareElements(array);
    }
    
}
