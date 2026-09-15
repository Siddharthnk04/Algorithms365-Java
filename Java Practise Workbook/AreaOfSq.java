import java.util.Scanner;

public class AreaOfSq 
{
    int areaOfSquare(int n)
    {
        int area = square(n);
        return area;
    }

    int square(int n)
    {
        return n * n;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of a square : ");
        int side = sc.nextInt();

        AreaOfSq obj = new AreaOfSq();

        System.out.println(obj.areaOfSquare(side));
    }
}
