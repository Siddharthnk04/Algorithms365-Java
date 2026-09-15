import java.util.Scanner;

public class CubeCallsSquare 
{
    int cube(int n)
    {
        return n * square(n);
    }

    int square(int n)
    {
        return n * n;
    }

    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        CubeCallsSquare obj = new CubeCallsSquare();

        System.out.println(obj.cube(num));
    }
}
