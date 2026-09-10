public class OneObjectForAll 
{
    //1. No args, no return
    void greet()
    {
        System.out.println("Hii.");
    }


    //2. Args, no return
    void printSum(int a, int b)//a=10 b=15
    {
        System.out.println("Sum : " + (a+b)); //25
    }


    //3. no args, return
    int getNumber()
    {
        return 100;
    }


    //4. args, return
    int max(int x, int y) //x=10 y=15
    {
        if (x > y)
            return x;
        else
            return y; //15
    }


    public static void main(String[] args) 
    {
        OneObjectForAll obj = new OneObjectForAll();

        obj.greet();

        obj.printSum(12, 8);

        System.out.println(obj.getNumber());

        int largest = obj.max(12, 42);
        System.out.println(largest);
    }
}
