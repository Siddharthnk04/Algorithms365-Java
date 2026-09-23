public class CountOfKey 
{
    int countKey(int key, int... nums)
    {
        int count = 0;

        for (int n : nums)
        {
            if (n == key)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) 
    {
        CountOfKey obj = new CountOfKey();

        System.out.println(obj.countKey(20,20,10,20,30,20,40,20));
    }
}
