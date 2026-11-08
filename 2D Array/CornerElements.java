public class CornerElements 
{
    static void printCornerElements(int[][] A)
    {
        for (int i = 0; i < A.length; i++)
        {
            for (int j = 0; j < A[i].length; j++)
            {
                if ((i > 0 && i < A.length - 1) || (j > 0 && j < A[i].length - 1))
                    System.out.print("  ");
                else
                    System.out.print(A[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
        int[][] A = {{3,5,9}, {7,6,2}, {4,8,1}};

        printCornerElements(A);
    }
}
