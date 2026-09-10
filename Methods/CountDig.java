public class CountDig 
{
    //Static void
    /*static void countDigits(int n) 
    {
        int count = 0;
        while (n > 0)
        {
            count++;
            n /= 10;
        }
        System.out.println(count);
    }

    public static void main(String[] args) 
    {
        int a = 74365, b = 5789;
        countDigits(a);
        countDigits(b);
    }*/


    //Static non void
    /*static int countDigits(int n) 
    {
        int count = 0;
        while (n > 0)
        {
            count++;
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) 
    {
        int a = 74365, b = 5789;
        System.out.println(countDigits(a));
        System.out.println(countDigits(b));
    }*/


    //Instance void
    void countDigits(int n) 
    {
        int count = 0;
        while (n > 0)
        {
            count++;
            n /= 10;
        }
        System.out.println(count);
    }

    public static void main(String[] args) 
    {
        int a = 7435865, b = 5789;

        CountDig ob = new CountDig();

        ob.countDigits(a);
        ob.countDigits(b);
    }


    //Instance non void
    /*int countDigits(int n) 
    {
        int count = 0;
        while (n > 0)
        {
            count++;
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) 
    {
        int a = 7435865, b = 5789;

        CountDig ob = new CountDig();

        System.out.println(ob.countDigits(a));
        System.out.println(ob.countDigits(b));
    }*/
}
