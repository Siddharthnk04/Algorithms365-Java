public class EvenOrOdd 
{

    //Static void
    /*static void evenOdd(int n) 
    {
        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
        
    }

    public static void main(String[] args) 
    {
        int a = 4, b = 9;
        evenOdd(a);
        evenOdd(b);

    }*/


    //Static non void ---- return
    /*static String evenOdd(int n) 
    {
        if (n % 2 == 0)
            return "Even";
        else
            return "Odd";
        
    }

    public static void main(String[] args) 
    {
        int a = 4, b = 9;
        System.out.println(evenOdd(a));
        System.out.println(evenOdd(b));

    } */


    //Static non void ---- return
    /*static boolean  isEven(int n) 
    {
        return (n % 2 == 0);
        
    }

    public static void main(String[] args) 
    {
        int a = 4, b = 9;
        System.out.println(isEven(a));
        System.out.println(isEven(b));

    }*/

    
    // Instance void
    /*void evenOdd(int n)
    {
        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

    public static void main(String[] args) 
    {
        int a = 8, b = 9;
        EvenOrOdd ob = new EvenOrOdd();
        ob.evenOdd(a);
        ob.evenOdd(b);
    }*/

    //Instance non void ----- return
    boolean  isEven(int n) 
    {
        return (n % 2 == 0);
        
    }

    public static void main(String[] args) 
    {
        int a = 4, b = 9;
        EvenOrOdd obj = new EvenOrOdd();

        boolean result = obj.isEven(a);

        if (result)
            System.out.println("Even");
        else
            System.out.println("Odd");

    }

}
