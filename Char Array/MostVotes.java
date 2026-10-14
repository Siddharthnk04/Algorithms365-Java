

public class MostVotes 
{
    static char candidateWithMostVotesOverall(char[] booth1, char[] booth2, char[] booth3)
    {
        if (booth1 == null || booth2 == null || booth3 == null)
            return '?';

        int countAWins = 0;
        int countBWins = 0;

        char boothWinner = getWinner(booth1);
        if (boothWinner == 'A')
            countAWins++;
        else if (boothWinner == 'B')
            countBWins++;

        boothWinner = getWinner(booth2);
        if (boothWinner == 'A')
            countAWins++;
        else if (boothWinner == 'B')
            countBWins++;
        
        boothWinner = getWinner(booth3);
        if (boothWinner == 'A')
            countAWins++;
        else if (boothWinner == 'B')
            countBWins++;

        if (countAWins > countBWins)
            return 'A';

        if (countAWins < countBWins)
            return 'B';

        return 'T';
    }

    static char getWinner(char[] booth)
    {
        int countA = 0;
        int countB = 0;

        for (char ch : booth)
        {
            if (ch == 'A')
                countA++;
            else if (ch == 'B')
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
