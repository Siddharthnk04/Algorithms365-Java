//Demonstration for Type Casting

//Widening : smaller data into larger data type.
/*class Widening 
{
    public static void main(String[] args) 
    {
        int num = 100;
        int result = num;
        
        System.err.println(num);
        System.err.println(result);
    }
}*/

//Narrowing : put larger data into smaller type
class Narrowing 
{
    public static void main(String[] args) 
    {
        int num = 100;
        byte result = (byte) num;
        
        System.err.println(num);
        System.err.println(result);
    }
}