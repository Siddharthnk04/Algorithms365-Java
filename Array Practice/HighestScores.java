public class HighestScores 
{
    static int findHingestScorer(int[] player1, int[] player2, int[] player3)
    {
        if (player1 == null || player2 == null || player3 == null)
            return -1;

        int player1Score = getScore(player1);
        int player2Score = getScore(player2);
        int player3Score = getScore(player3);
        
        if (player1Score >= player2Score && player1Score >= player3Score)
            return 1;
        else if (player2Score >= player1Score && player2Score >= player3Score)
            return 2;
        else
            return 3;
    }

    static int getScore(int[] nums)
    {
        int sum = 0;

        for (int x : nums)
            sum += x;

        return sum;
    }

    public static void main(String[] args) 
    {
        int[] player1 = {30, 45, 20};
        int[] player2 = {50, 10, 40};
        int[] player3 = {25, 35, 30};

        System.out.println(findHingestScorer(player1, player2, player3));
    }
}
