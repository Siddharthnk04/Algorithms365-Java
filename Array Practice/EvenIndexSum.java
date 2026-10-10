public class EvenIndexSum 
{
    static int getEvenIndicesSum(int[] nums)
    {
        if (nums == null || nums.length == 0)
        {
            System.out.println("Invalid Input");
            return -1;
        }
            
        int sum = 0;

        for (int i = 0; i < nums.length; i += 2)
            sum += nums[i];
        
        return sum;
    }

    public static void main(String[] args) 
    {
        int[] nums = {10, 3, 20, 7, 30};

        System.out.println(getEvenIndicesSum(nums));
    }
}
