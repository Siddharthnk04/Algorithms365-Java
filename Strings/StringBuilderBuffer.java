public class StringBuilderBuffer 
{
    public static void main(String[] args) 
    {
        demoAppend();
        demoInsert();
        demoDelete();
        demoReplace();
        demoReverse();
        demoCapacity();
        demoSetCharAt();
        demoSetLength();
    }

    // append()
    // add text at the end
    public static void demoAppend()
    {
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" programming");
        System.out.println(sb);
    }

    // insert()
    // insert text at specified index
    public static void demoInsert()
    {
        StringBuilder sb = new StringBuilder("Java");
        sb.insert(2, " programming");
        System.out.println(sb);
    }

    // delete()
    public static void demoDelete()
    {
        StringBuilder sb = new StringBuilder("Java Programming");
        sb.delete(2, 5);
        System.out.println(sb);
    }

    // replace()
    public static void demoReplace()
    {
        StringBuilder sb = new StringBuilder("Java Programming");
        sb.replace(0, 4, "Python");
        System.out.println(sb);
    }

    // reverse()
    public static void demoReverse()
    {
        StringBuilder sb = new StringBuilder("Java");
        sb.reverse();
        System.out.println(sb);
    }

    // capacity()
    public static void demoCapacity()
    {
        StringBuilder sb = new StringBuilder();
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());
    }

    // setCharAt()
    public static void demoSetCharAt()
    {
        StringBuilder sb = new StringBuilder("Java");
        sb.setCharAt(2, 'z');
        System.out.println(sb);
    }

    // setLength()
    public static void demoSetLength()
    {
        StringBuilder sb = new StringBuilder("Java Programming");
        sb.setLength(10);
        System.out.println(sb.length());
        System.out.println(sb);
    }

}
