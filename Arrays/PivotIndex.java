public class PivotIndex 
{
    static int pivotIndex(int[] nums)
    {
        int totalSum = 0;
        for (int x : nums)
        {
            totalSum += x;
        }

        System.out.println(-6 / 2);

        int sum = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (sum == (totalSum - (nums[i]) + sum))
            {
                return i;
            }
            else
            {
                sum += nums[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) 
    {
        System.out.println(pivotIndex(new int[] {-1,-1,-1,-1,-1,-1}));
    }
}
