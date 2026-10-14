public class GradeACount 
{
    static int countStudentsWIthGradeA(char[] grades)
    {
        if (grades == null || grades.length == 0)
            return -1;

        int count = 0;

        for (char ch : grades)
        {
            if (ch == 'A' || ch == 'a')
                count++;
        }

        return count;
    }

    public static void main(String[] args) 
    {
        char[] grades = {'A','B','A','C','A','B'};

        System.out.println(countStudentsWIthGradeA(grades));
    }
}
