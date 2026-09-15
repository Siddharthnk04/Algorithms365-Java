public class PercentageCallsTotalMarks 
{
    double percentage(int[] marks)
    {
        double totalMarks = totalMarks(marks);
        return totalMarks / marks.length;
    }

    int totalMarks(int a[])
    {
        int total = 0;

        for (int i = 0; i < a.length; i++)
            total += a[i];

        return total;
    }

    public static void main(String[] args) 
    {
        int marks[] = {83,70,90,60,99};

        PercentageCallsTotalMarks obj = new PercentageCallsTotalMarks();

        System.out.println(obj.percentage(marks) + "%");
    }
}
