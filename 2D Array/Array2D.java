import java.util.Arrays;

public class Array2D 
{
    // Print 2D Array
    static void print2DArray(int[][] data)
    {
        System.out.println();
        
        for (int row = 0; row < data.length; row++)
        {
            for (int col = 0; col < data[row].length; col++)
            {
                System.out.print(data[row][col] + " ");
            }
            System.out.println();
        }
    }

    // Sum Of All Elements
    static int getSumOfAllElements(int[][] matrix)
    {
        if (matrix == null || matrix.length == 0)
            return 0;

        int sum = 0;

        for (int row = 0; row < matrix.length; row++)
        {
            if (matrix[row] != null)
                for (int col = 0; col < matrix[row].length; col++)
                    sum += matrix[row][col];
        }

        return sum;
    }

    // Find Max Element
    static int findMaxElement(int[][] matrix)
    {
        if (matrix == null || matrix.length == 0)
            return 0;

        int max = matrix[0][0];

        for (int row = 0; row < matrix.length; row++)
        {
            if (matrix[row] != null)
            {
                for (int col = 0; col < matrix[row].length; col++)
                {
                    if (matrix[row][col] > max)
                        max = matrix[row][col];
                }
            }
        }

        return max;
    }

    // Find Min Element
    static int findMinElement(int[][] matrix)
    {
        if (matrix == null || matrix.length == 0)
            return 0;

        int min = matrix[0][0];

        for (int row = 0; row < matrix.length; row++)
        {
            if (matrix[row] != null)
            {
                for (int col = 0; col < matrix[row].length; col++)
                {
                    if (matrix[row][col] < min)
                        min = matrix[row][col];
                }
            }
        }

        return min;
    }

    // Even And Odd Count
    static int[] finfEvenAndOddCount(int[][] matrix)
    {
        if (matrix == null || matrix.length == 0)
            return new int[] {-1 -1};

        int evenCount = 0;
        int oddCount = 0;

        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[row].length; col++)
            {
                if (matrix[row][col] % 2 == 0)
                    evenCount++;
                else
                    oddCount++;
            }
        }

        return new int[] {evenCount, oddCount};
    }

    // Search element in 2D Array
    static boolean searchElement(int[][] matrix, int key)
    {
        if (matrix == null || matrix.length == 0)
            return false;

        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[row].length; col++)
                if (matrix[row][col] == key)
                    return true;
        }

        return false;
    }

    // Print Main Diagonal
    static void printMainDiagonal(int[][] matrix)
    {
        if (matrix == null || matrix.length == 0)
            return;

        for (int i = 0; i < matrix.length; i++)
            System.out.println(matrix[i][i]);
    }

    // Print Secondary Diagonal
    static void printSecondaryDiagonal(int[][] matrix)
    {
        if (matrix == null || matrix.length == 0)
            return;

        int j = matrix[0].length - 1;

        for (int i = 0; i < matrix.length; i++)
            System.out.println(matrix[i][j--]);
    }

    // Scalar Multiplication
    static int[][] scalarMultiplication(int[][] matrix, int scalar)
    {
        int[][] result = new int[matrix.length][matrix[0].length];

        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[row].length; col++)
                result[row][col] = matrix[row][col] * scalar;
        }

        return result;
    }

    // Sum of Each row
    static int[] findSumOfEachRow(int[][] data)
    {
        int[] result = new int[data.length];
        
        for (int row = 0; row < data.length; row++)
        {
            int sum = 0;

            for (int col = 0; col < data[row].length; col++)
            {
                sum += data[row][col];
            }
            result[row] = sum;
        }

        return result;
    }

    // Sum of Each Column
    static int[] findSumOfEachColumn(int[][] data)
    {
        int[] result = new int[data.length];
        
        for (int col = 0; col < data[0].length; col++)
        {
            int sum = 0;
            
            for (int row = 0; row < data.length; row++)
            {
                sum += data[row][col];
            }
            result[col] = sum;
        }

        return result;
    }

    // Sum of elements greater then 50
    static int findSumOfElementsGreaterThan50(int[][] matrix)
    {
        if (matrix == null || matrix.length == 0)
            return -1;

        int sum = 0;

        for (int[] x : matrix)
        {
            for (int y : x)
                if (y > 50)
                    sum += y;
        }

        return sum;
    }

    // Max element in each row
    static int[] findMaxElementInEachRow(int[][] matrix)
    {
        if (matrix == null || matrix.length == 0)
            return null;

        int[] result = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++)
        {
            int max = matrix[i][0];

            for (int j = 1; j < matrix[i].length; j++)
            {
                if (matrix[i][j] > max)
                    max = matrix[i][j];
            }

            result[i] = max;
        }

        return result;
    }

    // Min Even Number
    static int getMinEvenNumber(int[][] matrix)
    {
        if (matrix == null || matrix.length == 0)
            return -1;

        int minEven = Integer.MAX_VALUE;

        for (int[] x : matrix)
        {
            for (int y : x)
                if ((y & 1) == 0 && y < minEven)
                    minEven = y;
        }

        if (minEven == Integer.MAX_VALUE) // No even number present
            return -1;

        return minEven;
    }

    // Multiply Elements of Main Diagonal with 10
    static int[][] multiplyMainDiagonalWith10(int[][] matrix)
    {
        if (matrix == null || matrix.length == 0)
            return null;

        int[][] result = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                if (i == j)
                    result[i][j] = matrix[i][j] * 10;
                else
                    result[i][j] = matrix[i][j];
            }
        }

        return result;
    }

    // Count occurance od an element
    static int countOccurance(int[][] matrix, int key)
    {
        if (matrix == null || matrix.length == 0)
            return 0;

        int count = 0;

        for (int[] x : matrix)
        {
            for (int y : x)
            {
                if (y == key)
                    count++;
            }
        }

        return count;
    }

    // Search element only in Main diagonal
    static boolean searchElementInMainDiagonal(int[][] matrix, int key)
    {
        if (matrix == null || matrix.length == 0)
            return false;

        for (int i = 0; i < matrix.length; i++)
        {
            if (matrix[i][i] == key)
                return true;
        }

        return false;
    }

    static void swapMatrix(int[][] matrix)
    {
        if (matrix == null || matrix.length == 0)
            return;

        for (int[] a : matrix)
        {
            for (int i = 0; i < a.length / 2; i++)
            {
                int temp = a[i];
                a[i] = a[a.length - i - 1];
                a[a.length - i - 1] = temp;
            }
        }
    }

    public static void main(String[] args) 
    {
        int[][] matrix = {
                    {3, 5, 9},
                    {7, 6, 2},
                    {4, 8, 1}
                };

        System.out.println(getSumOfAllElements(matrix));

        int maxElement = findMaxElement(matrix);
        System.out.println(maxElement);

        int minElement = findMinElement(matrix);
        System.out.println(minElement);

        System.out.println(Arrays.toString(finfEvenAndOddCount(matrix)));

        System.out.println(searchElement(matrix, 8));

        int[][] result = scalarMultiplication(matrix, 2);
        print2DArray(result);

        printSecondaryDiagonal(matrix);
        System.out.println(Arrays.toString(findSumOfEachRow(matrix)));
        System.out.println(Arrays.toString(findSumOfEachColumn(matrix)));

        System.out.println(findSumOfElementsGreaterThan50(matrix));

        System.out.println(Arrays.toString(findMaxElementInEachRow(matrix)));
        System.out.println(getMinEvenNumber(matrix));

        int[][] res = multiplyMainDiagonalWith10(matrix);
        print2DArray(res);

        System.out.println(countOccurance(matrix, 5));

        System.out.println(searchElementInMainDiagonal(matrix, 6));

        swapMatrix(matrix);
        print2DArray(matrix);
    }
}
