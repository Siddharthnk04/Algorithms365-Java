public class AddTwoNumbers 
{
    //Static void
    static void add(int a, int b)
    {
        System.out.println("Sum : " + (a+b));
    }

    public static void main(String[] args) 
    {
        int a = 10, b = 20;
        add(a,b);


    }


    //Static non void
    /*static int add(int a, int b)
    {
        return (a+b);
    }

    public static void main(String[] args) 
    {
        int a = 10, b = 20;
        int sum = add(a,b);
        System.out.println("Sum : " + sum);

    }*/
   

    //Instance void
    /*void add(int a, int b)
    {
        System.out.println("Sum : " + (a+b));
    }

    public static void main(String[] args) 
    {
        int a = 10, b = 20;
        AddTwoNumbers obj = new AddTwoNumbers();
        obj.add(a, b);
    }*/


    //Instance non void
    /*int add(int a, int b)
    {
        return (a+b);
    }

    public static void main(String[] args) 
    {
        int a = 10, b = 20;
        AddTwoNumbers obj = new AddTwoNumbers();
        int sum = obj.add(a, b);
        System.out.println("SUm : " + sum);
    }*/
}
