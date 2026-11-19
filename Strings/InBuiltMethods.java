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
        // contains
        // Returns true if and only if this string contains the specified sequence of char values.
        System.out.println(str.contains("av"));

        // Checking
        // Startswith
        // Gives true if the string starts with the specified prefix.
        System.out.println(str.startsWith("J"));
        System.out.println(str.startsWith("Jav"));
        System.out.println(str.startsWith("va"));

        // Endswith
        // Gives true if the string ends with the specified suffix
        System.out.println(str.endsWith("a"));
        System.out.println(str.endsWith("va"));
        System.out.println(str.endsWith("av"));
        
        // Extraction
        // Substring
        // parameter : beginIndex
        // begins with the character at the specified index and extends to the end of this string.
        System.out.println("JavaJava".substring(2));

        // parameter : beginIndex, endIndex
        // begins at the specified beginIndex and extends to the character at index endIndex - 1. 
        // Thus the length of the substring is endIndex-beginIndex.
        System.out.println("JavaJava".substring(2, 6));

        // Spliting
        // Splits this string around matches of the given regular expression.
        String[] array = "I love java".split(" ");
        System.out.println(Arrays.toString(array));

        // Strip
        // Removes leading and trailing white spaces
        System.out.println("   I love Java".strip());

        // Trim
        // Removes leading and trailing white spaces
        System.out.println("  I love java  ".trim());

        // isEmpty()
        // Gives true if the string is empty, or else gives false
        System.out.println("Not Empty".isEmpty());
        System.out.println(" ".isEmpty());
        System.out.println("".isEmpty());
        
        // Blank
        // Gives true if the string is empty or has white spaces, else gives false
        System.err.println("hd".isBlank());
        System.out.println("   ".isBlank());
        System.out.println("".isBlank());

        // replace
        // Returns a string resulting from replacing all occurrences of oldChar in this string with newChar.
        System.out.println(str.replace('a', '@'));

        // replace all
        // Replaces each substring of this string that matches the given regular expression with the given replacement.
        System.out.println(str.replaceAll("av", "%f"));

        // indexOf
        // Returns the index within this string of the first occurrence of the specified character.
        System.out.println(str.indexOf('a'));

        // Returns the index within this string of the first occurrence of the specified character, 
        // starting the search at the specified index.
        System.out.println(str.indexOf('a', 2));

        // last indexOf()
        // Returns the index within this string of the last occurrence of the specified character
        System.out.println(str.lastIndexOf('a'));

        // value of
        // Returns the string representation of the int argument
        System.out.println(str.valueOf(34));

        // concat
        // Concatenates the specified string to the end of this string.
        System.out.println(str.concat("Java"));

        // join
        // Returns: a new String that is composed of the elements separated by the delimiter
        // delimiter - the delimiter that separates each element
        // elements - the elements to join together.
        System.out.println(str.join("-", "I", "Love", "Java"));



        System.out.println("Good".concat(" morning"));

        System.out.println("Java".repeat(5));

        System.out.println(String.valueOf(12345));

        String string = "Java is easy, java is crazy";

        System.out.println(string.replaceFirst("is", "*"));


    }
}
