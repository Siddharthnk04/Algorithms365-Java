public class QuizScore 
{
    static int calculateQuizScore(char[] choosenAnswers, char[] keyAnswers)
    {
        if (choosenAnswers == null || keyAnswers == null)
            return -1;

        int score = 0;

        for (int i = 0; i < keyAnswers.length; i++)
        {
            if (isLetter(choosenAnswers[i]) && isLetter(keyAnswers[i]))
            {
                if (Character.toUpperCase(choosenAnswers[i]) == Character.toUpperCase(keyAnswers[i]))
                    score++;
            }
        }

        return score;
    }

    static boolean isLetter(char ch)
    {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }

    public static void main(String[] args) 
    {
        char[] choosenAnswers = {'A','C','B','D','A'};
        char[] keyAnswers = {'A','B','B','D','C'};

        System.out.println(calculateQuizScore(choosenAnswers, keyAnswers));
    }
}
