public class ClosestToAverage 
{
    static int findClosestToAverage(int[] nums)
    {
        if (nums == null || nums.length == 0)
            return  -1;

        double average = 0.0;
        for (int x : nums)
            average += x;

        average = average / nums.length;

        int closest = nums[0];
        double minDistance;

        if (nums[0] > average)
            minDistance = nums[0] - average;
        else
            minDistance = average - nums[0];

        for (int i = 1; i < nums.length; i++)
        {
            double distance;
            if (nums[i] > average)
                distance = nums[i] - average;
            else
                distance = average - nums[i];

            if (distance < minDistance)
            {
                closest = nums[i];
                minDistance = distance;
            }
        }
        return closest;
    }

    public static void main(String[] args) 
    {
        int[] nums = {2, 9, 4, 15};

        System.out.println(findClosestToAverage(nums));
    }
}
