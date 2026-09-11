public class ObjectForEach 
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
        //Obj1 for greet()
        ObjectForEach obj1 = new ObjectForEach();
        obj1.greet();

        //obj2 for printSum()
        ObjectForEach obj2 = new ObjectForEach();
        obj2.printSum(10, 20);

        //obj3 for getNumber()
        ObjectForEach obj3 = new ObjectForEach();
        int num = obj3.getNumber();
        System.out.println(num);

        //obj4 for max()
        ObjectForEach obj4 = new ObjectForEach();
        int c = obj3.max(10, 25);
        System.out.println(c);
    }
}
