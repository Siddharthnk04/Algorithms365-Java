public class AnagramCheck 
{
    static boolean areAnagrams(char[] first, char[] second)
    {
        if (first == null || second == null)
            return false;

        int[] frequency = new int[26];

        for (int i = 0; i < first.length; i++)
        {
            if (isLetter(first[i]))
                frequency[Character.toLowerCase(first[i]) - 97]++;
        }

        for (int i = 0; i < second.length; i++)
        {
            if (isLetter(second[i]))
                frequency[Character.toLowerCase(second[i]) - 97]--;
        }

        for (int n : frequency)
        {
            if (n != 0)
                return false;
        }

        return true;
    }

    static boolean isLetter(char ch)
    {
        return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
    }

    public static void main(String[] args) 
    {
        char[] first = {'D','o','r','m','i','t','o','r','y'};
        char[] second = {'d','i','r','t','y',' ','r','o','o','m'};

        System.out.println(areAnagrams(first, second));
    }
}
