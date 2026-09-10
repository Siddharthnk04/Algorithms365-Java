

public class Increment 
{
    public static void main(String[] args) 
    {
        int count = 10;
        System.out.println(count++); //10
        System.out.println(count); //11
        System.out.println(count++); //11
        System.out.println(count++); //12
        System.out.println(count); //13

        //Decrement
        System.out.println(count--); //13
        System.out.println(count); //12
        System.out.println(count--); //12
        System.out.println(count--); //11


        System.out.println(++count); //11
        System.out.println(count); //11
        System.out.println(++count); //12
        System.out.println(++count); //13

        System.out.println(--count); //12
        System.out.println(count); //12
        System.out.println(--count); //11

        System.out.println();
        int store = count;
        store++;
        System.out.println(store);

        int count1 = 12;
        int count2 = count1++;
        System.out.println(count2);  //12
        System.out.println(count1);  //13

        int a =13;
        int b = ++a;
        System.out.println(b); //14
        System.out.println(a); //14

        // behaviour in expression
        System.out.println("Expression");
        int c = 10;
        System.out.println(c++ + 5); //15
        System.out.println(c); //11
        System.out.println(++c + 5); //17
        System.out.println(c); //12

        //confusing behaviour
        System.out.println("confusing beh");
        int num = 10;
        System.out.println(num++ + ++num); //22

        num=11;
        System.out.println(num++ + num++); //23

        System.out.println("confusing beh");
        int num2 =12;
        System.out.println(num2++ - ++num2); //-2

        int num3 = 20;
        System.out.println(++num3 + --num3); //41

        int a1=5, b1=10;
        System.out.println(a1++ + ++b1);
        System.out.println(a1);
        System.out.println(b1);

        int x=4;
        System.out.println(++x + x++);
        System.out.println(x);

        //10 confusing questions

    }
    
}
