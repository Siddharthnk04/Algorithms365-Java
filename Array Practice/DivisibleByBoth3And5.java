public class DivisibleByBoth3And5 
{
    static int countNumbersDivisibleByBoth3And5 (int[] nums)
    {
        if (nums == null || nums.length == 0)
            return -1;

        int count = 0;

        for (int x : nums)
        {
            if (x % 3 == 0 && x % 5 == 0)
                count++;
        }

        return  count;
    }

    public static void main(String[] args) 
    {
        int[] nums = {15, 9, 30, 10, 45, 7};

        System.out.println(countNumbersDivisibleByBoth3And5(nums));
        
    }
}
