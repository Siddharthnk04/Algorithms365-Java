import java.util.*;
class AreaOfTriangle 
{
    public static void main(String[] args) 
    {
        int height, base;
        float area;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height : ");
        height = sc.nextInt();

        System.out.println("Enter base : ");
        base = sc.nextInt();

        area = 0.5f*height*base;
        System.out.println("Area : " + area);


    }    
}
