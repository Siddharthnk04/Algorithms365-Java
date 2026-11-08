public class BoundaryElements 
{
    static void printBoundaryElements(int[][] matrix)
    {
        if (matrix == null || matrix.length == 0)
            return;

        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[row].length; col++)
            {
                if (row == 0 || row == matrix.length - 1 || col == 0 || col == matrix[row].length - 1)
                    System.out.print(matrix[row][col] + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
        int[][] A = {{3,5,9}, {7,6,2}, {4,8,1}};

        printBoundaryElements(A);
    }
}
