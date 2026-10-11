public class MostRunsInAnOver 
{
    static int findOverWithMostRunsScored(int[] runs)
    {
        if (runs == null || runs.length == 0)
            return -1;

        int maxRuns = runs[0];
        int overWithMaxRuns = 1;
        for (int i = 1; i < runs.length; i++)
        {
            if (runs[i] > maxRuns)
            {
                maxRuns = runs[i];
                overWithMaxRuns = i + 1;
            }
        }

        return overWithMaxRuns;
    }

    public static void main(String[] args) 
    {
        int[] runs = {6, 12, 4, 15, 9};

        System.out.println(findOverWithMostRunsScored(runs));
    }
}
