import java.util.Scanner;

public class LinearSearch 
{
    static int linearSearch(int[] array, int size, int key)
    {
        for (int i = 0; i < size; i++)
        {
            if (array[i] == key)
            {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter array elements : ");
        for (int i = 0; i < size; i++)
        {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter a number to search : ");
        int key = sc.nextInt();

        int index = linearSearch(array, size, key);
        if(index == -1)
        {
            System.out.println("Key not found");
        }
        else
        {
            System.out.println("Key found at index : " + index);
        }
    }
}
