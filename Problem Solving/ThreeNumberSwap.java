public class ThreeNumberSwap 
{
    public static void main(String[] args) 
    {
        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println();
        System.out.println("******Before Swaping******");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("c : "+c);

        //Using extra memory

        /*int temp = a;
        a = b; //a = 20
        b = c; //b = 30
        c = temp; //c = 10 

        System.out.println();

        System.out.println("******After Swapping******");

        System.out.println();
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("c : "+c);*/


        //Not using extra memory

        a=a+b+c;
        b=a-b-c;
        c=a-b-c;
        a=a-b-c;

        System.out.println();

        System.out.println("******After Swapping******");

        System.out.println();
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("c : "+c);
    }
}
