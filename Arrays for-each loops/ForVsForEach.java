import java.util.Scanner;

public class ForVsForEach 
{
    void modifyUsingForEach(int[] a)
    {
        for (int x : a)
        {
            x = x * 10;
        }
    }

    void modifyUsingFor(int[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            a[i] = a[i] * 10;
        }
    }

    void display(int[] a)
    {
        for (int x : a)
        {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of an array : ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter " + n + " elemnts : ");

        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }

        ForVsForEach obj = new ForVsForEach();

        System.out.println("Original array");
        obj.display(a);

        obj.modifyUsingForEach(a);

        System.out.println("Array after modifyUsingForEach()");
        obj.display(a);

        obj.modifyUsingFor(a);

        System.out.println("Array after modifyUsingFor()");
        obj.display(a);
    }
}
