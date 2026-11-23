public class DecodeCompressedString 
{
    public static void main(String[] args) 
    {
        testDecode("a10b12c4");
        testDecode("x1y3");

    }

    public static void testDecode(String input)
    {
        System.out.println("Input : " + input);
        String res = decode(input);
        System.out.println("Output : " + res);
        System.out.println(res.length());
        System.out.println();
    }

    // public static String decode(String str)
    // {
    //     StringBuilder result = new StringBuilder();

    //     for (int i = 0; i < str.length(); i += 2)
    //     {
    //         for (int j = 0; j < str.charAt(i + 1) - '0'; j++) // Parsing : converting one format to other
    //         {
    //             result.append(str.charAt(i));
    //         }
    //     }

    //     return result.toString();
    // }

    public static String decode(String str)
    {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++)
        {
            int number = 1;

            if (Character.isLetter(str.charAt(i)))
            {
                int start = i + 1;
                int end = start;

                for (int j = start; j < str.length() && Character.isDigit(str.charAt(j)); j++)
                    end++;

                number = Integer.valueOf(str.substring(start, end));
            }

            for (int j = 0; j < number; j++)
            {
                result.append(str.charAt(i));
            }
            i += String.valueOf(number).length();
        }

        return result.toString();
    }

}
