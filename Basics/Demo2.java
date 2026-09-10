public class Demo2 
{
    public static void main(String[] args) 
    {
        int x = 5;
        System.err.println("x : " + x);
        int y = -5;
        System.err.println("y : " + y);

        System.out.println(x + " to binary : " + Integer.toBinaryString(x));
        System.out.println(y + " to binary : " + Integer.toBinaryString(y));
    }
}
