public class SameLetters 
{
    static boolean isLetter(char ch)
    {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }

    static boolean isSameLetters(char[] arr1, char[] arr2)
    {
        if (arr1 == null || arr2 == null)
            return false;


        int count1 = 0;
        int count2 = 0;

        for (char ch : arr1)
        {
            if (isLetter(ch))
                count1++;
        }

        for (char ch : arr2)
        {
            if (isLetter(ch))
                count2++;
        }

        if (count1 != count2)
            return false;

        for (char ch : arr1)
        {
            if(!isLetter(ch))
                continue;

            boolean found = false;

            for (int i = 0; i < arr2.length; i++)
            {
                if (arr2[i] == ch)
                {
                    arr2[i] = '0';
                    found = true;
                    break;
                }
            }

            if (!found)
                return false;
        }

        return true;
    }

    public static void main(String[] args) 
    {
        char[] arr1 = {'s','i','l','e','n','t'};
        char[] arr2 = {'l','i','s','t','e','n'};

        System.out.println(isSameLetters(arr1, arr2));
    }
}
