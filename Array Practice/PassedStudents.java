public class PassedStudents 
{
    static int countPassedStudents (int[] marks)
    {
        if (marks == null || marks.length == 0)
            return -1;

        int count = 0;

        for (int x : marks)
        {
            if (x >= 35)
                count++;
        }

        return count;
    }

    public static void main(String[] args) 
    {
        int[] marks = {40, 82, 35, 90, 78};

        System.out.println(countPassedStudents(marks));
        
    }
}
