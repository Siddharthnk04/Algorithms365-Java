


public class Pattern 
{
    public static void main(String[] args) 
    {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number : ");
        // int n = sc.nextInt();

        /*for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= 5; j++)
            {
                System.out.print(i+j +" ");
            }
            System.out.println();
        }*/

        /*int count = 0;
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= 5; j++)
            {
                count++;
                System.out.printf("%4d", count);
                //System.out.format("%02d" + " ", count);
            }
            System.out.println();
        }*/

        /*for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j +" ");
            }
            System.out.println();
        }*/

        /*for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }*/

        /*int count = 0;
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                count++;
                System.out.printf("%4d", count);
            }
            System.out.println();
        }*/

        /*for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= 5-i+1; j++)
            {
                System.out.print(j +" ");
            }
            System.out.println();
        }*/

        /*for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= 5-i+1; j++)
            {
                System.out.print("*" +" ");
            }
            System.out.println();
        }*/

        /*for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= 5; j++)
            {
                if (j >= i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            } 
            System.out.println();
        }

        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
            for (int j =i; j <= 5; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <=i; j++)
                System.out.print(i + " ");
            System.out.println();
        }

        for (int i = 1; i <= 5; i++)
        {
            for (int j =1; j <= i; j++)
                System.out.print(5-i+j + " ");
            System.out.println();
        }*/

        /*for (int i = 1; i <= 5; i++)
        {
            for (int j = i; j <=5; j++)
                System.out.print(j + " ");
            System.out.println();
        }*/

        /*for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= 5 - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= 2*i-1; k++)
                System.out.print("*");
            System.out.println();
        } */

        /*for (int i = 5; i >= 1; i--)
        {
            for(int j = 1; j <= 5 - i; j++)
                System.out.print(" ");
            for(int k = 1; k <= 2*i-1; k++)
                System.out.print("*");
            System.out.println();
        }*/


        /*for (int i = 1; i <= 4; i++)
        {
            for(int j = 1; j <= 5 - i; j++)
                System.out.print(" ");
            for(int k = 1; k <= 2*i-1; k++)
                System.out.print("*");
            System.out.println();
        }

        for (int i = 5; i >= 1; i--)
        {
            for (int j = 1; j <= 5 - i; j++)
                System.out.print(" ");

            for (int k = 1; k <= 2*i-1; k++)
                System.out.print("*");

            System.out.println();
        }*/

        for (int i = 1; i <= 9; i++)
        {
            if (i <= 5)
            {
                for (int j = 1; j <= 5 - i; j++)
                    System.out.print(" ");
                for (int k = 1; k <= 2*i-1; k++)
                    System.out.print("*");
            }
            else
            {
                for (int j = 1; j <= i - 5; j++)
                    System.out.print(" ");
                for (int k = 1; k <= (2*(9-i)+1); k++)
                    System.out.print("*");
            }
            System.out.println();
        }

        
    }
}
