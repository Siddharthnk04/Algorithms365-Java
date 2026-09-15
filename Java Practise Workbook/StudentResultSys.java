
import java.util.Arrays;

public class StudentResultSys 
{
    static int totalMarks(int[] marks)
    {
        int total = 0;

        for(int i = 0; i < marks.length; i++)
            total += marks[i];

        return total;
    }

    static double percentage(double totalMarks)
    {
        return totalMarks / 500 * 100;
    }

    static char grade(double percentage)
    {
        if (percentage >= 90)
            return 'A';
        if (percentage >= 75)
            return 'B';
        if (percentage >= 50)
            return 'C';
        if (percentage >= 35)
            return 'D';
        return 'F';
    }

    public static void main(String[] args) 
    {
        String name = "Ramesh";
        int[] marks = {80,70,90,60,100};

        int totalMarks = totalMarks(marks);
        double percentage = percentage(totalMarks);
        char grade = grade(percentage);

        System.out.println("Name : " + name);
        System.out.println("Marks : " + Arrays.toString(marks));
        System.out.println("Total Marks : " + totalMarks);
        System.out.println("Percentage : " + percentage + "%");
        System.out.println("Grade : " + grade);
    }
}
