public class DataTypes1 
{
    public static void main(String[] args) 
    {
        //Integer data types
        byte byteValue = 10; //1byte  -128 to 127
        short shortValue = 200; //2bytes -2¹⁵ to 2¹⁵ - 1
        int intValue = 1000;  //4bytes  -2³¹ to 2³¹ -1
        long longValue = 254641545454L;   //8bytes  -2⁶³ to 2⁶³ - 1

        float floatValue = 3.14f;
        double doubleValue = 3.14758655454d;

        char charValue = 'a';
        boolean booleanValue = true;
        String stringValue = "Hello";

        System.out.println();
        System.out.println("byte Value : "+byteValue);
        System.out.println("short Value : "+shortValue);
        System.out.println("int Value : "+intValue);
        System.out.println("long Value : "+longValue);
        System.out.println("float Value : "+floatValue);
        System.out.println("double Value : "+doubleValue);
        System.out.println("char Value : "+charValue);
        System.out.println("boolean Value : "+booleanValue);
        System.out.println("String Value : "+stringValue);


    }
}
