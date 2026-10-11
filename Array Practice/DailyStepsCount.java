import java.util.Arrays;

public class DailyStepsCount 
{
    static int[] count10000Steps(int[] steps)
    {
        if (steps == null || steps.length == 0)
            return new int[] {-1, -1};

        int count = 0;
        int maxSteps = steps[0];

        for (int x : steps)
        {
            if (x >= 10000)
                count++;

            if (x > maxSteps)
                maxSteps = x;
        }

        return new int[] {count, maxSteps};
    }

    public static void main(String[] args) 
    {
        int[] steps = {8000, 12000, 10500, 9000, 15000};

        System.out.println(Arrays.toString(count10000Steps(steps)));
    }   
}
