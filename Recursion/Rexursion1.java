public class Rexursion1 
{
    static void fun(int n)
    {
        if (n == 0)
            return;

        System.out.println("Enter : " + n);
        fun(n - 1);
        System.out.println("Exit : " + n);
    }

    public static void main(String[] args) 
    {
        fun(3);
    }
}
