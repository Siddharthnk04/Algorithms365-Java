public class StaticMethod 
{
    /*static void display() //Method belongs to class, no need to create object.
    {
        System.out.println("Hello.");
    }
    public static void main(String[] args) 
    {
        display();
    }*/
   static int max(int x, int y)//x=10 y=15 // recv data -----  formal parameters
   {
        if (x > y) //10 > 15
            return x;
        else
            return y; //return 15

        //Scope checking
        //System.out.println(a);  //a is not in this method
   }


    public static void main(String[] args) 
    {
        int a = 10, b =15;

        int c = max(a, b); //a=10, b = 15  // send data ------ actual parameters
        System.out.println(c);

        //System.out.println(x); // x is not in this method
    }
}
