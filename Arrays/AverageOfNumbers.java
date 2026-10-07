public class AverageOfNumbers 
{
    static double findAverage(int[] nums)
    {
        if (nums == null || nums.length == 0)
            return -1;

        double sum = 0;

        for (int number : nums)
        {
            sum += number;
        }

        return sum / nums.length;
    }

    public static void main(String[] args) 
    {
        int[] nums = {10, 4, -8, 3};

        System.out.println(findAverage(nums));
        System.out.println(findAverage(null));
        System.out.println(findAverage(new int[] {}));
    }
    
}
