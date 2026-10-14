import java.util.Arrays;

public class FullName 
{
    static char[] getFullName(char[] first, char[] last)
    {
        if (first == null || last == null || first.length == 0)
            return null;

        if (last.length == 0)
            return first;

        char[] fullName = new char[first.length + last.length + 1];
        int index = 0;

        for (char ch : first)
            fullName[index++] = ch;

        fullName[index++] = ' ';

        for (char ch : last)
            fullName[index++] = ch;

        return fullName;
    }

    public static void main(String[] args) 
    {
        char[] first = {'r','a','m'};
        char[] last = {'k','u','m','a','r'};

        System.out.println(Arrays.toString(getFullName(first, last)));
    }
}
