public class ForEachLoop 
{
    static void show(int[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]);

            if (i != a.length - 1)
                System.out.print(", ");
        }
    }

    static void traverse(int[] a)
    {
        for (int x : a)
        {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) 
    {
        show(new int[] {1, 2, 3, 4});
        System.out.println(); //anonymous array
        traverse(new int[] {4, 5, 6, 7});
    }
}