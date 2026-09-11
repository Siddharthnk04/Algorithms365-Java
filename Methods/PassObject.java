public class PassObject 
{
    static void update(int arr[]) // 10,20,30,40
    {
        arr[0] = 100;//100,20,30,40

        System.out.println("Inside update : " + arr[0]); //100
    }
    public static void main(String[] args) 
    {
        int a[] = {10, 20, 30, 40};
        System.out.println("Before method Call : " + a[0]); //10

        update(a);

        System.out.println("After method Call : " + a[0]); //100
    }
}
