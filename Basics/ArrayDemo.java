import java.util.Arrays;

class ArrayDemo 
{
    public static void main(String[] args) 
    {
        //int arr[5];   Syntax error
        int arr[] = new int[5];
        System.out.println(arr);  //hash  value
        System.out.println(Arrays.toString(arr));  //default value

        int arr1[] = {10,20,30};
        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));

        int arr2[] = new int[] {10,20,30,42};
        System.out.println(arr2);
        System.out.println(Arrays.toString(arr2));

    }   
}
