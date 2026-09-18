public class PassByValue 
{
    // static int[] getEvenNumbers(int[] nums)
    // {
    //     int even[] = {2 , 4};
    //     return even;
    // }

    public static void main(String[] args) 
    {
        int num = 10;
        makeItHalf(num);
        System.out.println(num);

        int num2 = 20;
        num2 = makeItHalf_v2(num2);
        System.out.println(num2);
        
        
    }
    static void makeItHalf(int number)
    {
        number = number / 2;
    }

    static int makeItHalf_v2(int number)
    {
        number = number / 2;
        return number;
    }
}
