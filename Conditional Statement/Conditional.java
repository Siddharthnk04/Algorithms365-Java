import java.util.*;
class Conditional 
{
    public static void main(String[] args) 
    {

        //int age = 15;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your age : ");
        // int age = sc.nextInt();

        //IF
        /*if(age >= 18)
        {
            System.out.println("Eligible");
        } */
        

        //If else
        /*if(age >= 18)
        {
            System.out.println("Eligible");
        } 
        else
        {
            System.out.println("Not Elibible");
        }*/


        //if else if

        /*if(age >= 18)
        {
            System.out.println("Eligible");
        } 
        else if(age < 18 && age > 0)
        {
            System.out.println("Not Elibible");
        }
        else
        {
            System.out.println("Invalid");
        }*/

        //Nested if
        // System.out.println("citixenship: True/False");
        // boolean citizen = sc.nextBoolean();

        // if(age >= 18)
        // {
        //     if(citizen)
        //     {
        //         System.out.println("Eligible");
        //     }
        //     else
        //     {
        //         System.out.println("Not Eligible");
        //     }
        // }
        // else
        // {
        //     System.out.println("Age less than 18");
        // }


        //Switch
        Scanner sc = new Scanner(System.in);
        System.out.println("Day numbers (1 to 7) : ");
        int day = sc.nextInt();

        // switch(day)
        // {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
            
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
                
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;

        //     case 4:
        //         System.out.println("Thursday");
        //         break;

        //     case 5:
        //         System.out.println("Friday");
        //         break;

        //     case 6:
        //         System.out.println("Saturday");
        //         break;

        //     case 7:
        //         System.out.println("Sunday");
        //         break;

        //     default:
        //         System.out.println("Invalid");
        // }

        if (day == 1)
        {
            System.out.println("Monday");
        }
        else if (day == 2)
        {
            System.out.println("Tuesday");
        }
        else if (day == 3)
        {
            System.out.println("Wednesday");
        }
        else if (day == 4)
        {
            System.out.println("Thursday");
        }
        else if (day == 5)
        {
            System.out.println("Friday");
        }



        // System.out.println("Voting code using switch ");
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your age : ");
        // int age = sc.nextInt();

        // String result = age >= 18? "Yes":"No";

        // switch (result)
        // {
        //     case "Yes":
        //         System.out.println("Eligible");
        //         break;

        //     case "No":
        //         System.out.println("Not Eligible");
        //         break;
        // }


        // System.out.println("Combining conditions using logical operators");

        // int age = 25;
        // boolean citizen = false;

        // if (age >= 18 && citizen)
        // {
        //     System.out.println("Eligible");
        // }
        // else
        // {
        //     System.out.println("Nor Eligible");
        // }
    }
}
