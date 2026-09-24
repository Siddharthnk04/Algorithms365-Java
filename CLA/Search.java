public class Search 
{
    public static void main(String[] args) 
    {
        int key = Integer.parseInt(args[0]);
        boolean found = false;

        for (int i = 1; i < args.length; i++)
        {
            if (key == Integer.parseInt(args[i]))
            {
                found = true;
                break;
            }
        }

        if (found)
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("Not Found");
        }
    }
}
