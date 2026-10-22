public class LoopVsRecursion 
{
    static void print(int n)
    {
        if (n > 5)
            return;

        System.out.println(n);
        print(n + 1);
    }

    public static void main(String[] args) 
    {
        for (int i = 1; i <= 5; i++)
            System.out.println(i);

        print(1);
    }
}
