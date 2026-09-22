public class DivisibleByThree 
{
    void findDivisibleByThree(int[] arr)
    {
        for (int x : arr)
        {
            if (x % 3 == 0)
            {
                System.out.println(x);
            }
        }
    }

    public static void main(String[] args) 
    {
        int[] arr = {1, 3, 6, 8, 9, 41, 27, 81};

        DivisibleByThree obj = new DivisibleByThree();

        obj.findDivisibleByThree(arr);
    }
}
