class ReturnTypeMismatch 
{
    /*static int add()
    {
        return "Hello";
    }*/

    
    //Fix
    /*static String add()
    {
        return "Hello";
    }*/

    static int add()
    {
        return 100;
    }
    
    public static void main(String[] args) 
    {
        System.err.println(add());
    }
}
