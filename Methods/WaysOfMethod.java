public class WaysOfMethod 
{

    //1. No args, no return
    static void greet()
    {
        System.out.println("Hii.");
    }


    //2. Args, no return
    static void printSum(int a, int b)//a=10 b=15
    {
        System.out.println("Sum : " + (a+b)); //25
    }

    //3. no args, return
    static int getNumber()
    {
        return 100;
    }

    //4. args, return
    static int max(int x, int y) //x=10 y=15
    {
        if (x > y)
            return x;
        else
            return y; //15
    }
    public static void main(String[] args) 
    {
        //1
        greet();

        //2
        printSum(10, 15);

        //3
        System.out.println(getNumber());

        //4
        System.out.println(max(10, 15));
    }
}
