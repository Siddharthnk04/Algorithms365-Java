class Bitwise 
{
    public static void main(String[] args) 
    {
        int x = 10;
        int y = 6;
        int z;
        System.out.println("& AND");
        z=x&y;
        System.out.println(z);

        System.out.println();
        System.out.println("| OR");
        System.out.println(x|y);

        System.out.println();
        System.out.println("^ XOR");
        System.out.println(x^y);

        System.out.println();
        System.out.println("~ NOT");
        System.out.println(~x);
        System.out.println(~y);

        System.out.println();
        System.out.println("leftshift");
        int a = 10;
        System.out.println("Shift by 1 " + (a << 1));
        System.out.println("Shift by 2 " + (a << 2));
        System.out.println("Shift by 3 " + (a << 3));

        System.out.println();
        int b = -50;
        System.out.println("Rightshift / Signed right shift");
        System.out.println("Shift by 1 " + (b >> 1));
        System.out.println("Shift by 2 " + (b >> 2));
        System.out.println("Shift by 3 " + (b >> 3));

        int c = -10;
        System.out.println("UnSigned right shift");
        System.out.println("Shift by 1 " + (c >>> 1));
        System.out.println("Shift by 2 " + (c >>> 2));
        System.out.println("Shift by 3 " + (c >>> 3));

        //Relational
        a=10;
        b=20;
        c=10;
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a<=c);

        //Logical
        System.out.println();
        System.out.println("&&");
        System.out.println("Logical");
        System.out.println(true && false);
        System.out.println(true && true);
        System.out.println(false && false);

        System.out.println();
        System.out.println("||");
        System.out.println("Logical");
        System.out.println(true || false);
        System.out.println(true || true);
        System.out.println(false || false);

        System.out.println();
        System.out.println("!");
        System.out.println(!false);
        System.out.println(!true);
        //System.out.println(!a);

        a=5;
        a+=10;
        System.out.println(a);

        a-=4;
        System.out.println(a);

        a*=10;
        System.out.println(a);

        a/=2;
        System.out.println(a);



    }
}
