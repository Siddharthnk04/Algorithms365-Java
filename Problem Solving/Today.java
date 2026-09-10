class Today 
{
    public static void main(String[] args) 
    {
        //Byte and Byte = int
        /*byte a = 10;
        byte b = 20;
        
        //byte c = a+b;  Lossy conversion
        byte c = (byte)(a+b);  //type casting
        int d = a+b;

        System.err.println(c);
        System.out.println(d);
        
        //Byte and short = int
        byte b1 = 23;
        short s1 = 234;

        //short res = b1+s1;   Lossy conversion
        int res = b1+s1;
        System.out.println(res);*/

        //Byte and int = int
        /*byte b2 = 12;
        int val = 56;
        int res1 = b2+val;
        System.out.println(res1);*/

        //Byte and long = long
        /*byte a = 12;
        long l = 34;
        //int res = a+l; //Type mismatch: cannot convert from long to int
        long res = a + l;
        System.out.println(res);*/

        //Short and Short = int
        /*short a = 23;
        short b = 35;
        //short res = a+b;  Type mismatch: cannot convert from int to short
        int res = a+b;
        System.out.println(res);*/

        //Short and int = int
        /*short a = 23;
        int b = 345;
        int res = a+b;
        System.out.println(res);*/

        //Short and long = long
        /*short s = 234;
        long l = 4567;
        //short res = s+l;  Type mismatch: cannot convert from long to short
        //int res = s+l;    Type mismatch: cannot convert from long to int
        long res = s+l;
        System.out.println(res);*/

        //Short and char = int
        /*short a = 23;
        char ch = 'A';
        //short res = a+ch;  Type mismatch: cannot convert from int to short
        int res = a+ch;
        System.err.println(res);*/

        //Char and char = int
        /*char a = 'A';
        char b = 'b';
        //char c = a+b; Type mismatch: cannot convert from int to char
        int c = a+b;
        System.out.println(c);*/

        //int and char = int
        /*int a = 45;
        char b = 'Z';
        int res = a+b;
        System.out.println(res);*/

        //Float and int = float
        /*int a = 10;
        float b = 3.5f;
        //int res = a+b;   Type mismatch: cannot convert from float to int
        float res = a+b;
        System.out.println(res);*/

        //float and byte = float 
        /*byte a = 34;
        float b = 56.8f;
        //int res = a+b;   Type mismatch: cannot convert from float to int
        float res = a+b;
        System.out.println(res);*/

        //float and short = float
        /*float a = 5.8f;
        short b = 45;
        float res = a+b;
        System.out.println(res);*/


        //float and double = double
        /*float a = 34.8f;
        double b = 56.89;
        //float res = a+b;   Type mismatch: cannot convert from double to float
        double res = a+b;
        System.err.println(res);*/

        //float and char = float
        /*char a = 'S';
        float b = 345.748f;
        float res = a+b;
        System.out.println(res);*/

        //double and long = double
        /*long l =3454343523L;
        double d = 325.876778;
        //long res = l+d;   Type mismatch: cannot convert from double to long
        double res = l+d;
        System.out.println(res);*/

        //Double and int = double
        /*int a = 345;
        double b = 34.578;
        //int res = a+b;     Type mismatch: cannot convert from double to int
        double res = a+b;
        System.out.println(res);*/

        //Double and short = double
        short a = 25;
        double b = 34.567;
        double res = a+b;
        System.out.println(res);


    }
}
