import java.util.Arrays;

public class GreaterThan50LessThan100 
{
    static int[] getNumbersGreaterThan50LessThan100 (int[] nums)
    {
        if (nums == null || nums.length == 0)
            return new int[] {-1, -1};

        int count = 0;
        for (int x :  nums)
        {
            if (x > 50 && x < 100)
                count++;
        }

        int[] result = new int[count];
        int i = 0;
        for (int x : nums)
        {
            if (x > 50 && x < 100)
            {
                result[i] = x;
                i++;
            }
        }
        return result;
    }

    public static void main(String[] args) 
    {
        int[] nums = {45, 67, 100, 52, 99, 120, 50};

        System.out.println(Arrays.toString(getNumbersGreaterThan50LessThan100(nums)));
    }
}
