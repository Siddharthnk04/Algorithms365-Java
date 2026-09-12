public class MethodOverloading 
{
    int max (byte x,  byte y)
    {
        if (x > y)
            return x;
        return y;
    }

    // int max (byte x,  byte y) //Parameters cannot be of same type
    // {
    //     if (x > y)
    //         return x;
    //     return y;
    // }

    int max (int x,  int y)
    {
        if (x > y)
            return x;
        return y;
    }

    float max(float x, float y) //When int is not there, this will be called. ---widening
    {
        if (x > y)
            return x;
        return y;
    }

    //Max of three numbers
    int max (int x,  int y, int z)
    {
        if (x > y && x > z)
            return x;
        if (y > x && y > z)
            return y;
        return z;
    }

    double max(double x, double y)
    {
        if (x > y)
            return x;
        return y;
    }


    long max(long x, long y)
    {
        if (x > y)
            return x;
        return y;
    }

    public static void main(String[] args) 
    {
        byte a = 8, b = 56;

        MethodOverloading obj = new MethodOverloading();

        System.out.println(obj.max(10.0, 8.5));
        System.out.println(obj.max(10L, 8));
        System.out.println(obj.max(10, 8, 30));
        System.out.println(obj.max(a, b));
    }
}
