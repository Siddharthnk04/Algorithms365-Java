
public class ReturnArr 
{

    static int[] update()
    {
        int a[] = {10, 20, 30, 40};
        return a;

    }
    public static void main(String[] args) 
    {
        int arr[] = update();
        System.out.println("Before Modification");
        //System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3]);
        for(int i = 0; i < arr.length;i++)
            System.out.print(arr[i] + " ");

        arr[0] = 100;

        System.out.println();

        System.out.println("After Modification");
        //System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3]);

        for(int i = 0; i < arr.length;i++)
            System.out.print(arr[i] + " ");
        
    }
}
