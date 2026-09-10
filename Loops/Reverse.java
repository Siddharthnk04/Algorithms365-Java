public class Reverse 
{
    public static void main(String[] args) 
    {
        int a = 527;
        int res = a%10;
        
        a=a/10;
        res = (res*10) + (a%10);
        a=a/10;
        res = (res*10) + (a%10);

        System.out.println("Reverse of : " + res);

    }
}
