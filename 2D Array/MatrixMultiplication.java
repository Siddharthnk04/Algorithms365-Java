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

    static int[][] matrixMultiplication (int[][] A, int[][] B)
    {
        if (A[0].length != B.length)
        {
            System.out.println("Cannot Multiply");
            return null;
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

        return C;
    }

    public static void main(String[] args) 
    {
        int[][] A = {{1,2}, {3,4}};
        int[][] B = {{5,6}, {7,8}};

        int[][] C = matrixMultiplication(A,B);
        print2DArray(C);
    }
}
