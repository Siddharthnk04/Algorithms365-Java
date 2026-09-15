import java.util.*;

public class MarksCard 
{
    static int totalMarks(int[] marks)
    {
        int total = 0;
        for (int i = 0; i < 5; i++)
        {
            total += marks[i];
        }

        return total;
    }

    static double percentage(double percentage)
    {
        return percentage / 500 * 100;
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
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = sc.nextLine();

        int[] marks = new int[5];

        System.out.println("Enter Marks : ");
        for (int i = 0; i < 5; i++)
        {
            System.out.print("Subject " + (i+1) + " : ");
            marks[i] = sc.nextInt();
        }

        int totalMarks = totalMarks(marks);
        double percentage = percentage(totalMarks);
        char grade = grade(percentage);

        System.out.println();
        System.out.println();
        System.out.println(" ===== MARKS CARD ===== ");
        System.out.println("Student name : " + name);
        System.out.println("Marks Obtained : " + Arrays.toString(marks));
        System.out.println("Total Marks : " + totalMarks);
        System.out.println("Percentage : " + percentage);
        System.out.println("Grade : " + grade);
    }
}
