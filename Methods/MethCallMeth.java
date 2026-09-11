public class MethCallMeth 
{
    static void welcome ()
    {
        greet();
    }

    static void greet()
    {
        System.out.println("Good Morning");
    }

    public static void main(String[] args) 
    {
        welcome();
    }
}
