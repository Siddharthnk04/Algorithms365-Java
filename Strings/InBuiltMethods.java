import java.util.Arrays;

public class InBuiltMethods 
{
    public static void main(String[] args) 
    {
        String str = "Java";
        String str1 = "java";

        // Converts string to char arr
        // String is immutable but char arr is mutable
        char[] arr = str.toCharArray();
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));


        // Compares two string for exact equality
        // compares content
        // str1.equals(str2);
        System.out.println(str.equals("java"));
        System.out.println(str.equals(str1));

        // Compares content ignoring cases
        // Uppercase and lowercase letters are treated equal
        System.out.println(str.equalsIgnoreCase("java"));

        // str.compareTo(str1)
        // Compares strings lexicographically
        // Returns 0 if both strings are equal
        // Return less than 0 if first string comes before second
        // Return more than zero if first string comes after second
        System.out.println(str.compareTo(str1));
        System.out.println("Apple".compareTo("App")); 


        // str.comparesToIgnoreCase
        System.out.println("abc".compareToIgnoreCase("Apple"));

        // Searching
        System.out.println(str.contains("av"));

        // Checking
        // Startswith
        System.out.println(str.startsWith("J"));
        System.out.println(str.startsWith("Jav"));
        System.out.println(str.startsWith("jav"));

        // Endswith
        System.out.println(str.endsWith("a"));
        System.out.println(str.endsWith("va"));
        
        // Extraction
        // Substring
        System.out.println("JavaJava".substring(2));
        System.out.println("JavaJava".substring(2, 6));

        // Spliting
        String[] array = "I love java".split(" ");
        System.out.println(Arrays.toString(array));
        System.out.println("   I love Java".strip());
    }
}
