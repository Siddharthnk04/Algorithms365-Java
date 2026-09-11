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

    public static void main(String[] args) 
    {
        MethodOverloading obj = new MethodOverloading();
        System.out.println(obj.max(10.0f, 8.0f));
        System.out.println(obj.max(10, 8, 30));
    }
}
