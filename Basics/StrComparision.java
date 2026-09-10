

public class StrComparision 
{
    public static void main(String[] args) 
    {
        int a = 10;
        int b = 10;

        // if (a.equals(b))   // This is object invoking
        // {
        //     System.out.println("Equal");
        // }
        // else
        // {
        //     System.out.println("Not Equal");
        // }

        // if (a==b)
        // {
        //     System.out.println("Equal");
        // }
        // else
        // {
        //     System.out.println("Not Equal");
        // }

        String day = "Saturday";
        
        if (day == "Saturday")
        {
            System.out.println("Equal");
        }

        if(day.equals(day))
        {
            System.out.println("Holiday");
        }

        // String s1 = new String("Java");
        // String s2 = new String("Java");

        // if (s1 == s2)
        // {
        //     System.out.println("Equal");
        // }
        // else
        // {
        //     System.out.println("Not Equal");
        // }
    }
}
