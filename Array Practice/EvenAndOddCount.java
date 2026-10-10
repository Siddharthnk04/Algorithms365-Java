import java.util.Arrays;

public class EvenAndOddCount 
{
    static int[] getEvenAndOddCount(int[] nums)
    {
        if (nums == null)
        {
            return new int[] {-1, -1};
        }
        int evenCount = 0;
        int oddCount = 0;

        for (int x : nums)
        {
            if (x % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        return new int[] {evenCount, oddCount};
    }

    public static void main(String[] args) {
        int[] nums = {3, 8, 5, 12, 7, 9, 8, 19};

        System.out.println(Arrays.toString(getEvenAndOddCount(nums)));
    }
}
