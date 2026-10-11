public class RaviAndSitaMarks 
{
    static int countSubjectsWhereRaviScoredMore(int[] raviMarks, int[] sitaMarks)
    {
        if (raviMarks == null || sitaMarks == null || raviMarks.length != sitaMarks.length || raviMarks.length == 0)
            return -1;

        int count = 0;

        for (int i = 0; i < raviMarks.length; i++)
        {
            if (raviMarks[i] > sitaMarks[i])
                count++;
        }

        return count;
    }

    public static void main(String[] args) 
    {
        int[] raviMarks = {78, 65, 90, 55, 82};
        int[] sitaMarks = {70, 80, 85, 60, 82};

        System.out.println(countSubjectsWhereRaviScoredMore(raviMarks, sitaMarks));
    }
}
