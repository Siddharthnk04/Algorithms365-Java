class Operators 
{
    public static void main(String[] args) 
    {
        int a = 20;
        int b = 40;
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println();

        //Arithmatic Operater
        System.out.println("Addition : " + (a+b));
        System.out.println("Subtraction : " + (a-b));
        System.out.println("Multiplication : " + (a*b));
        System.out.println("Division : " + (a/b));
        System.out.println("Modulus : " + (a%b));

        System.out.println();

        System.out.println("-a : " + -a);
        System.out.println("+a : " + +a);
        System.out.println("--a : " + --a);
        System.out.println("a-- : " + a--);
        System.out.println("a : " + a);
        System.out.println("a-- : " + a--);
        System.out.println("++a : " + ++a);
        System.out.println("a++ : " + a++);
        System.out.println("a : " + a);

        //Integer vs Float
        System.out.println();
        System.out.println();
        System.out.println("Integer vs Float");
        System.out.println();
        System.out.println("20 % 6 : " + (20 % 6));
        System.out.println("20.0 % 6 : " + (20.0 % 6));
        System.out.println("20 % 6.0 : " + (20 % 6.0));
        System.out.println("20.0 % 6.0 : " + (20.0 % 6.0));


        //Precedence  [* , /] > [+ , - , %] 
        System.out.println();
        System.out.println();
        System.out.println("Precedence");
        System.out.println();
        System.out.println("10+5*2 : " + (10+5*2));
        System.out.println("(10+5)*2 : " + ((10+5)*2));
        System.out.println("20-5+2 : " + (20-5+2));
        System.out.println("20-(5+2) : " + (20-(5+2)));

        //Boolean
                
        System.out.println();
        System.out.println("Boolean");
        System.out.println();
        boolean x = true;
        boolean y = false;
        System.out.println("x : " +x);
        System.out.println("y : " +y);

        /*System.out.println("x + y : " + (x+y));    The operator + is undefined for the argument type(s) boolean, boolean
        System.out.println("x - y : " + (x-y));
        System.out.println("x * y : " + (x*y));
        System.out.println("x / y : " + (x/y));
        System.out.println("x % y : " + (x%y));*/

        System.out.println();
        System.out.println("The operators are undefined for the argument type(s) boolean, boolean");
        

        
    }
}
