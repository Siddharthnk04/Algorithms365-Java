public class MatrixMultiplication 
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

    static void matrixMultiplication (int[][] A, int[][] B)
    {
        if (A == null || B == null)
            return;

        if (A.length == 0 || B.length == 0)
            return;

        if (A[0].length != B.length)
        {
            System.out.println("Cannot Multiply");
            return;
        }
        int[][] C = new int[A.length][B[0].length];

        for (int i = 0; i < A.length; i++)
        {
            for (int j = 0; j < B[0].length; j++)
            {
                for (int k = 0; k < A[0].length; k++)
                {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        print2DArray(C);
    }

    public static void main(String[] args) 
    {
        int[][] A = {{3,5,9}, {7,6,2}, {4,8,1}};
        int[][] B = {{1,0,0}, {0,1,0}, {0,0,1}};

        matrixMultiplication(A,B);
        
    }
}
