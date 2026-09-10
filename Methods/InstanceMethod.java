public class InstanceMethod 
{
    //Demo of instance method, create object and access
    int max (int x, int y) // x = 10   y = 15
    {
        if (x > y) // 10 > 15
            return x;
        else
            return y;// return 15
    }

    public static void main(String[] args) 
    {
        int a = 10, b = 15;
        InstanceMethod i = new InstanceMethod();
        int c = i.max(a, b);
        System.out.println(c);
    }
}
