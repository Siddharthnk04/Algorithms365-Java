public class MostVotesOverall 
{
    static char candidateWithMostVotesOverall(char[] booth1, char[] booth2, char[] booth3)
    {
        if (booth1 == null || booth2 == null || booth3 == null)
            return '?';

        int countA = 0;
        int countB = 0;

        for (char ch : booth1)
        {
            if (ch == 'A')
                countA++;
            else
                countB++;
        }

        for (char ch : booth3)
        {
            if (ch == 'A')
                countA++;
            else
                countB++;
        }

        for (char ch : booth2)
        {
            if (ch == 'A')
                countA++;
            else
                countB++;
        }

        if (countA > countB)
            return 'A';

        if (countB > countA)
            return 'B';

        return 'T';
    }

    public static void main(String[] args) 
    {
        char[] booth1 = {'A','B','A'};
        char[] booth2 = {'B','B','A','B'};
        char[] booth3 = {'A','A'};

        System.out.println(candidateWithMostVotesOverall(booth1, booth2, booth3));
    }
}
