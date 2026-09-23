public class ShowNames 
{
    void showNames(String... names)
    {
        for (String name : names)
        {
            System.out.println(name);
        }
    }

    public static void main(String[] args) 
    {
        ShowNames obj = new ShowNames();

        obj.showNames("Kishore", "Siddharth", "Shrinidhi", "Likith", "Venktesh");
    }
}
