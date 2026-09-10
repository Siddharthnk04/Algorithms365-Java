public class NestedLoop 
{
    public static void main(String[] args) 
    {
        //Prints each time in new line
        /*for (int i = 1; i <= 3; i++)
        {
            for (int j = 1; j <= 3; j++)
            {
                System.out.println(j);
            }
        }*/

        //Prints all in 1 line
        /*for (int i = 1; i <= 3; i++)
        {
            for (int j = 1; j <= 3; j++)
            {
                System.out.print(j);
            }
        }*/

        
        //Prints 3 in each line
        /*for (int i = 1; i <= 3; i++)
        {
            for (int j = 1; j <= 3; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }*/

        //Printing *
        /*for (int i = 1; i <= 3; i++)
        {
            for (int j = 1; j <= 3; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }*/

        //Printing i
        /*for (int i = 1; i <= 3; i++)
        {
            for (int j = 1; j <= 3; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }*/

        /*for (int i = 1; i <= 3; i++)
        {
            for (int j = 1; j <= 3; j++)
            {
                System.out.print("("+i+","+j+") ");
            }
            System.out.println();
        }*/

        //while inside while
        /*int i = 1;

        while (i <= 3)
        {
            int j = 1;

            while (j <= 4)
            {
                System.out.print("A ");
                j++;
            }

            System.out.println();
            i++;
        }*/

        //do while & do while
        /*int i = 1;

        do
        {
            int j = 1;

            do
            {
                System.out.print("* ");
                j++;
            } while (j <= 4);

            System.out.println();
            i++;
        } while (i <= 3);*/

        //for inside while
        /*int i = 1;

        while (i <= 3)
        {
            for(int j = 1; j <= 4; j++)
            {
                System.out.print("* ");
            }

            System.out.println();
            i++;
        }*/

        //while inside for
        /*for (int i = 1; i <= 3; i++)
        {
            int j = 1;
            while (j <= 4)
            {
                System.out.print("* ");
                j++;
            }
            System.out.println();
        }*/

        //while inside do while
        /*int i = 1;

        do
        {
            int j = 1;

            while (j <= 4)
            {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        } while (i <= 3);*/

        //do while inside while
        /*int i = 1;

        while (i <= 3)
        {
            int j = 1;

            do
            {
                System.out.print("* ");
                j++;
            } while (j <= 4);

            System.out.println();
            i++;
        }*/

        //for inside do while
        /*int i = 1;

        do
        {
            for (int j = 1; j <= 4; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
            i++;
        } while (i <= 3);*/

        //do while inside for
        for (int i = 1; i <= 3; i++)
        {
            int j = 1;
            do
            {
                System.out.print("* ");
                j++;
            } while (j <= 4);

            System.out.println();
        }
    }
}
