public class AddDigits 
{
    public static void main(String[] args) 
    {
        int a = 482;
        int sum = 0;

        sum = sum + (a%10);
        a=a/10;
        sum = sum + (a%10);
        a=a/10;
        sum = sum + (a%10);
        System.out.println("Sum : "+sum);
    }
    
}
