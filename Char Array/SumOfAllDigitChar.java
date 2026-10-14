public class SumOfAllDigitChar 
{
    static int getSumOfAllDigitChar(char[] chars)
    {
        if (chars == null || chars.length == 0)
            return -1;

        int sum = 0;

        for (char ch : chars)
        {
            if (ch >= '1' && ch <= '9')
                sum += ch - '0';
        }

        return sum;
    }

    public static void main(String[] args) 
    {
        char[] chars = {'a','3','b','7','2'};

        System.out.println(getSumOfAllDigitChar(chars));
    }
}
