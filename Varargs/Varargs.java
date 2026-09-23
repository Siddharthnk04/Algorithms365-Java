public class Varargs 
{
    static void show(int... a)
    {
        System.out.println("Args");

        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]);
            if (i < a.length - 1)
                System.out.print(", ");
        }
        System.out.println();
    }
    /*static void show()
    {
        System.out.println("No args.");
    }

    static void show(int a)
    {
        System.out.println("One args.");
    }

    static void show(int a, int b)
    {
        System.out.println("Two args.");
    }*/

    public static void main(String[] args) 
    {
        show();
        show(10);
        show(10, 20);
        show(10, 20, 30, 40, 50); // new int[] {10,20,30,40,50}
    }
}
