public class SingleCharacter 
{
    static char nextCharacter(char ch)
    {
        return ++ch;
    }

    static char previousChar(char ch)
    {
        return --ch;
    }

    static char toLowerCase(char ch)
    {
        return (char)(ch + 32);
    }

    static char toUpperCase(char ch)
    {
        return (char)(ch - 32);
    }

    static void upperCaseOrLowerCase(char ch)
    {
        if (ch >= 'A' && ch <= 'Z')
            System.out.println("Upper Case");
        else if (ch >= 'a' && ch <= 'z')
            System.out.println("Lower Case");
    }

    // Print characters at even indices
    // Char array
    static void printCharAtEvenIndices(char[] arr)
    {
        for (int i = 0; i < arr.length; i += 2)
        {
            System.out.print(arr[i]);
        }

        System.out.println();
    }

    // String
    static void printCharAtEvenIndices(String str)
    {
        for (int i = 0; i < str.length(); i += 2)
        {
            System.out.print(str.charAt(i));
        }

        System.out.println();
    }

    // Print middle char if length is odd or else print 2 middlr chars
    // char array
    static void printMiddleChars(char[] arr)
    {
        if ((arr.length & 1) == 1)
            System.out.println(arr[arr.length / 2]);
        else
            System.out.println(arr[arr.length / 2 - 1] + " " + arr[arr.length / 2]);
    }

    // String
    static void printMiddleChars(String str)
    {
        if ((str.length() & 1) == 1)
            System.out.println(str.charAt(str.length() / 2));
        else
            System.out.println(str.charAt(str.length() / 2 - 1) + " " + str.charAt(str.length() / 2));
    }

    public static void main(String[] args) 
    {
        // char ch = 'A';
        // System.out.println(nextCharacter(ch));

        // System.out.println(previousChar('B'));

        // System.out.println(toLowerCase('A'));
        // System.out.println(toUpperCase('a'));
        // upperCaseOrLowerCase('g');

        char[] array = {'J', 'a', 'v', 'a'};

        printCharAtEvenIndices(array);
        printCharAtEvenIndices("array");

        printMiddleChars(array);
        printMiddleChars("arrhay");
    }
}