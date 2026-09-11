public class Square 
{
    // static void 
    /*static void square(int a)
    {
        System.out.println(a*a); 
    }

    public static void main(String[] args) 
    {
        int a = 10;
        square(a);
    }*/
   

    // static non void
    /*static int square(int a)
    {
        return (a*a);
    }

    public static void main(String[] args) 
    {
        int a = 10;
        int sq = square(a);
        System.out.println(sq);
    }*/


    // Instance void
    void square(int n)
    {
        System.out.println(n*n);
    }

    public static void main(String[] args) 
    {
        int a = 7;
        Square obj = new Square();
        obj.square(a);
    }

    
    // Instance non void
    /*int square(int n)
    {
        return (n*n);
    }

    public static void main(String[] args) 
    {
        int a = 7;
        Square obj = new Square();
        int sq = obj.square(a);
        System.out.println(sq);
    }*/
}
