public class DaysInEachMonth 
{
    public static void main(String[] args) 
    {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        

        for (int month = 1; month <= 12; month++)
        {
            System.out.println(months[month - 1]);

            for (int day = 1; day <= daysInMonth[month - 1]; day++)
                System.out.print(day + " ");

            System.out.println();
        }
    }
}
