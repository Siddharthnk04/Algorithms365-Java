import java.util.Scanner;

public class Uppercase 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch = sc.next().charAt(0);

        if ((int)ch >= 65 && (int)ch <=90)
        {
            System.out.println("Uppercase");
        }
        
    }
}
