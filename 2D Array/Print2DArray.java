public class Print2DArray 
{
    static void printMatrix(int[][] A)
    {
        for (int[] x : A) // Passed reference to x
        {
            for (int y : x)
                System.out.print(y + " ");

            System.out.println();
        }
        System.out.println();
    }

    static int[][] addMatrix (int[][] A, int[][] B)
    {
        int maxCol = 0;
        for (int[] x : A)
            maxCol = Math.max(x.length, maxCol);

        for (int[] x : B)
            maxCol = Math.max(x.length, maxCol);

        int[][] C = new int[Math.max(A.length, B.length)][maxCol];

        int i = 0;

        while (i < Math.min(A.length, B.length))
        {
            int j = 0;
            while (j < Math.min(A[i].length, B[i].length))
            {
                C[i][j] = A[i][j] + B[i][j];
                j++;
            }

            while (j < A[i].length)
            {
                C[i][j] = A[i][j];
                j++;
            }

            while (j < B[i].length)
            {
                C[i][j] = B[i][j];
                j++;
            }

            i++;
        }

        while (i < A.length)
        {
            for (int j = 0; j < A[i].length; j++)
                C[i][j] = A[i][j];

            i++;
        }

        while (i < B.length)
        {
            for (int j = 0; j < B[i].length; j++)
                C[i][j] = B[i][j];

            i++;
        }
        return C;
    }

    public static void main(String[] args) 
    {
        int[][] A = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] B = {{1,0,0}, {0,1,0}, {0,0,1}};

        // for (int i = 0; i < A.length; i++)
        // {
        //     for (int j = 0; j < A[i].length; j++)
        //     {
        //         System.out.print(A[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // for (int[] a : A)
        // {
        //     for (int x : a)
        //     {
        //         System.out.print(x + " ");
        //     }
        //     System.out.println();
        // }

        // for (int[] a : B)
        // {
        //     for (int x : a)
        //     {
        //         System.out.print(x + " ");
        //     }
        //     System.out.println();
        // }

        int[][] C = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++)
        {
            for (int j = 0; j < A[i].length; j++)
            {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        printMatrix(A);
        printMatrix(B);

        printMatrix(C);
    }
}
