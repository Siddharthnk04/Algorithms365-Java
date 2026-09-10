import java.util.*;

public class Ocatal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        String num = sc.next();

        boolean octal = true;

        for(int i = 0; i<num.length();i++)
        {
            char ch = num.charAt(i);
            if (ch < '0' || ch > '7')
            {
                octal = false;
                break;
            }
        }

        if (octal)
        {
            System.out.println("Yes it is Octal");
            System.out.println("Radix : 8");
        }
        else
        {
            System.out.println("Not Octal");
        }

        

    }
    
}
