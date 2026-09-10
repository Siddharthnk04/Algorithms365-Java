class DefaultValues1 
{
    //Variable declaration is done outside the method
    static byte byteVal;
    static short shortVal;
    static int intVal;
    static long longVal;
    static float floatVal;
    static double doubleVal;
    static char charVal;
    static boolean booleanVal;
    static String s;

    public static void main(String[] args) 
    {
        //Local variables needs to be initialized 
        byte val1=(byte)36;
        short val2=999;
        int val3=30;
        long val4=404500000000000L;
        float val5=35.899f;
        double val6=5.1122354879;
        char val7='A';
        boolean val8=true;
        String val9 = "Hello";

        System.out.println();
        System.out.println("*****Default Values*****");
        System.out.println(byteVal);
        System.out.println(shortVal);
        System.out.println(intVal);
        System.out.println(longVal);
        System.out.println(floatVal);
        System.out.println(doubleVal);
        System.out.println(charVal);
        System.out.println(booleanVal);
        System.out.println(s);

        System.out.println();
        System.out.println("*****Initialization*****");
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);
        System.out.println(val5);
        System.out.println(val6);
        System.out.println(val7);
        System.out.println(val8);
        System.out.println(val9);

    }
}
