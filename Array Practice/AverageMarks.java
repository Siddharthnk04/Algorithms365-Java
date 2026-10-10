public class AverageMarks 
{
    static double findAverage (int[] marks)
    {
        if (marks == null || marks.length == 0)
            return -1;

        double sum = 0;

        for (int x : marks)
            sum += x;

        return sum / marks.length;
    }

    public static void main(String[] args) 
    {
        int[] marks = {70, 85, 90, 55, 83};

        System.out.println(findAverage(marks));
    }
}
