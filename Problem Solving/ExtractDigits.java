public class ExtractDigits 
{
    public static void main(String[] args) 
    {
        int a = 824;
        System.out.println("Number : " + a);
        System.out.println("Extracting Digits :");
        System.err.println(a%10);
        a=a/10;
        System.err.println(a%10);
        a=a/10;
        System.err.println(a%10);
        
    }
    
}
