public class Power 
{
    int power(int n, int x)
    {
        int result = 1;

        for (int i = 1; i <= x; i++)
        {
            result *= n;
        }
        return result;
    }

    public static void main(String[] args) 
    {
        Power obj = new Power();

        System.out.println(obj.power(2, 5));
        System.out.println(obj.power(3, 4));
    }
}
