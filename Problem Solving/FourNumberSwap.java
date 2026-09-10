public class FourNumberSwap
{
    public static void main(String[] args) 
    {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        System.out.println();
        System.out.println("******Before Swaping******");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("c : "+c);
        System.out.println("d : "+d);

        //Using extra memory

        /*int temp = a;
        a = b; //a = 20
        b = c; //b = 30
        c = d; //c = 40
        d = temp; //d=10 

        System.out.println();

        System.out.println("******After Swapping******");

        System.out.println();
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("c : "+c);
        System.out.println("d : "+d);*/


        //Not using extra memory

        a=a+b+c+d;
        b=a-b-c-d;
        c=a-b-c-d;
        d=a-b-c-d;
        a=a-b-c-d;

        System.out.println();

        System.out.println("******After Swapping******");

        System.out.println();
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("c : "+c);
        System.out.println("d : "+d);
    }
}
