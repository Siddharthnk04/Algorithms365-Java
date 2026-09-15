import java.util.Scanner;

public class ArrayOperations 
{
    static void printArray(int[] arr)
    {
        System.out.println("Array Elements : ");

        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void sum(int[] arr)
    {
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
            sum += arr[i];

        System.out.println("Sum : " + sum);
    }

    static void findMax(int[] arr)
    {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] > max)
                max = arr[i];
        }

        System.out.println("Max : " + max);
    }

    static void findMin(int[] arr)
    {
        int min  = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] < min)
                min = arr[i];
        }

        System.out.println("Min : " + min);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter a number : ");
            arr[i] = sc.nextInt();
        }

        int choice;

        do
        {
            System.out.println(" ===== ARRAY OPERATIONS =====");
            System.out.println("1. Print array elements");
            System.out.println("2. Find Sum");
            System.out.println("3. Find Max");
            System.out.println("4. Find Min");
            System.out.println("5. Exit");

            System.out.print("Enter your choice [1,2,3,4,5] : ");
            choice = sc.nextInt();

            switch (choice)
            {
                case 1 :
                    printArray(arr);
                    break;

                case 2 :
                    sum(arr);
                    break;

                case 3 :
                    findMax(arr);
                    break;

                case 4 :
                    findMin(arr);
                    break;

                case 5 :
                    System.out.println("Thank You!!!");
                    break;
                
                default:
                    System.out.println("Invalid choice!!!");
                    System.out.println("Choose from [1,2,3,4,5]");
            }
        } while (choice != 5);
    }
}
