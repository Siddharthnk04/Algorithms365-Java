public class CountEvenNumbers 
{
    int countEven(int... nums)
    {
        int count = 0;

        for (int x : nums)
        {
            if (x % 2 == 0)
            {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) 
    {
        CountEvenNumbers obj = new CountEvenNumbers();
        System.out.println(obj.countEven(10,20,25,15,30,10));
    }
}
