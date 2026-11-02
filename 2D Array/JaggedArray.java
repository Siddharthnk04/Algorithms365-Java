public class JaggedArray 
{
    static void print2DArray(int[][] A)
    {
        System.out.println();
        
        for (int[] x : A) // Passed reference to x
        {
            for (int y : x)
                System.out.print(y + " ");

            System.out.println();
        }
    }
    
    public static void main(String[] args) 
    {
        int[][] A;

        A = new int[3][];

        A[0] = new int[3];
        A[1] = new int[4];
        A[2] = new int[2];

        print2DArray(A);
    }
}
