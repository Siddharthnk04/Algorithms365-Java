class Error  
{
    //Return type mismatch error
    /*static int add()
    {
        return "Hello";
    }*/

    //Fix
    static String add()
    {
        return "Hello";
    }

    /*static int add()
    {
        return 100;
    }*/

    public static void main(String[] args) //s should be capital, : Unable to initialize main class error
    {

        //Syntax Error
        /*int a = 10
        System.out.println(a);*/


        //Symantic Error, logical error
        /*int a = 10;
        int b = 20;
        int area = 2*(a+b);
        System.out.println(area);*/        
        

        //Wrong Method
        /*int a = 10;
        System.out.printline(a);*/ //println


        //Duplicate Variable error
        /*int age = 25;
        int age = 25;
        System.out.println(age);*/

        // fix
        /*int age = 25;
        age = 25;
        System.out.println(age);*/

        /*int age1 = 25;
        int age2 = 25;
        System.out.println(age1);*/


        //Type Mismatch error
        /*int a = 10.5;
        System.out.println(a);*/

        //Fix
        /*int a = (int) 10.5;
        System.out.println(a);*/

        /*double a = 10.5;
        System.out.println(a);*/


        //Local variable initialization
        /*int age;      //Local variable should be initialized.. int age = 23; OR initialize variable outside thr method
        System.out.println(age);*/


        //Missing {} braces
        /*for(int i =1;i<=5;i++)
        {
            System.out.println(i);
            // Missing } 
        */

        System.out.println(add());
        
    }
}
