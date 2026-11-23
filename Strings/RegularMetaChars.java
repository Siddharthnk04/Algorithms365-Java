public class RegularMetaChars 
{
    public static void main(String[] args) 
    {
        // // \\d matches one digit
        // System.out.println("\\d");
        // System.out.println("5".matches("\\d"));
        // System.out.println("s".matches("\\d"));

        // // \\D matches non digit
        // System.out.println("\\D");
        // System.out.println("7".matches("\\D"));
        // System.out.println("h".matches("\\D"));
        // System.out.println("$".matches("\\D"));

        // // \\w matches one alphabet or number
        // System.out.println("\\w");
        // System.out.println("a".matches("\\w"));
        // System.out.println("1".matches("\\w"));
        // System.out.println("sid".matches("\\w"));
        // System.out.println("&".matches("\\w"));
        // System.out.println(" ".matches("\\w"));

        // // \\W matches non alphabet or number
        // System.out.println("\\W");
        // System.out.println("a".matches("\\W"));
        // System.out.println(" ".matches("\\W"));
        // System.out.println("6".matches("\\W"));
        // System.out.println("45".matches("\\W"));
        // System.out.println("@".matches("\\W"));
        // System.out.println("sid".matches("\\W"));

        // // \\s matches one space " "
        // System.out.println("\\s");
        // System.out.println(" ".matches("\\s"));
        // System.out.println("  ".matches("\\s"));
        // System.out.println("4".matches("\\s"));

        // // \\S non space char
        // System.out.println("\\S");
        // System.out.println(" ".matches("\\S"));
        // System.out.println("  ".matches("\\S"));
        // System.out.println("4".matches("\\S"));
        // System.out.println("67".matches("\\S"));

        // Quantifiers
        // * Star --> 0 or more
        /*System.out.println("*");
        System.out.println("Siddharth".matches("[abc]*"));
        System.out.println("abcbacbc".matches("[abc]*"));
        System.out.println("Siddharth".matches("\\w*"));
        System.out.println("3345".matches("\\d*"));
        System.out.println("334f5".matches("\\d*"));
        System.out.println("334df55".matches("\\w*"));
        System.out.println("Siddharth".matches(".*"));
        System.out.println("Siddharth%18".matches(".*"));
        System.out.println("".matches("[abc]*"));*/

        // + Plus --> 1 or more
        System.out.println("+");
        System.out.println("Siddharth".matches("[abc]+"));
        System.out.println("abcbcaa".matches("[abc]+"));
        System.out.println("".matches("[abc]+"));


        // {n} exact count
        System.out.println("{n}");
        System.out.println("abc".matches("[abc]{3}"));
        System.out.println("Siddharth".matches(".{6}"));
        System.out.println("Siddharth".matches("\\w{9}"));

        // {m, n} between m and n
        System.out.println("{m, n}");
        System.out.println("abc".matches("[abc]{1,4}"));
        System.out.println("Siddharth".matches(".{6,8}"));
        System.out.println("Siddharth".matches("\\w{9,10}"));

        // ? --> 0 or 1
        System.out.println("?");
        System.out.println("abbc".matches("[abc]?"));
        System.out.println("abbc".matches("abb?c"));
        System.out.println("Siddharth".matches(".?"));
        System.out.println("Siddharth".matches("\\w?"));
        System.out.println(" ".matches(".?"));
        System.out.println("".matches(".?"));
        System.out.println("5".matches("\\d?"));
        System.out.println("\n".matches("\n?"));
    }
}
