public class Regex 
{
    public static void main(String[] args) 
    {
        String text = "a";

        // . dot regex
        // matches any character except new line        
        System.out.println(text.matches("."));
        System.out.println("aa".matches(".."));
        System.out.println("aa".matches("."));
        System.out.println("aaa".matches("a.."));


        // [abc] regex
        // true for a or b or c
        System.out.println(text.matches("[abc]"));

        // [abc][vz] regex
        // needs 2 chars
        // true for av az bv bz cv cz
        System.out.println("av".matches("[abc][vz]"));

        // [^abc]  regex
        // true for all characters except a, b, c
        System.out.println(text.matches("[^abc]"));

        // [a-z1-7] regex
        System.out.println(text.matches("[a-z1-7]"));

        // A|B
        // true for A or B
        System.out.println(text.matches("A|B"));
        System.out.println("A".matches("A|B"));

        // xz regex
        // matches exact sequence
        System.out.println(text.matches("xz"));
        System.out.println("xz".matches("xz"));
    }
}
