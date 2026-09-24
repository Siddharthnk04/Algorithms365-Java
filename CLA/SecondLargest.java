public class SecondLargest 
{
    public static void main(String[] args) 
    {
        int largest = Integer.parseInt(args[0]);
        int SecondLargest = Integer.parseInt(args[0]);

        for (int i = 1; i < args.length; i++)
        {
            int x = Integer.parseInt(args[i]);

            if (x > SecondLargest)
            {
                if (x > largest)
                {
                    SecondLargest = largest;
                    largest = x;
                }
                else
                {
                    SecondLargest = x;
                }
            }
            else if (largest == SecondLargest)
            {
                SecondLargest = x;
            }
        }

        System.out.println(SecondLargest);
    }
}
