public class MaximumOfThree 
{
    //Static void
    /*static void maxOfThree(int a, int b, int c)
    {
        if (a>b && a>c)
            System.out.println(a);
        else if (b>a && b>c)
            System.out.println(b);
        else
            System.out.println(c);
    }

    public static void main(String[] args) 
    {
        int a = 9, b = 45, c = 8;
        maxOfThree(a, b, c);
    }*/


    //Static non void
    /*static int maxOfThree(int a, int b, int c)
    {
        if (a>b && a>c)
            return a;
        if (b>a && b>c)
            return b;
        return c;
    }

    public static void main(String[] args) 
    {
        int a = 9, b = 45, c = 8;
        int largest = maxOfThree(a, b, c);
        System.out.println(largest);
    }*/

    //Instance void
    void maxOfThree(int a, int b, int c)
    {
        if (a>b && a>c)
            System.out.println(a);
        else if (b>a && b>c)
            System.out.println(b);
        else
            System.out.println(c);
    }

    public static void main(String[] args) 
    {
        int a = 9, b = 45, c = 98;

        MaximumOfThree obj = new MaximumOfThree();

        obj.maxOfThree(a, b, c);
    }


    //Instance non void
    /*int maxOfThree(int a, int b, int c)
    {
        if (a>b && a>c)
            return a;
        if (b>a && b>c)
            return b;
        return c;
    }

    public static void main(String[] args) 
    {
        int a = 9, b = 45, c = 98;

        MaximumOfThree obj = new MaximumOfThree();

        int largest = obj.maxOfThree(a, b, c);
        System.out.println(largest);
    }*/
}
