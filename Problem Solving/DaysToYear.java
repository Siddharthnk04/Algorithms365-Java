public class DaysToYear 
{
    public static void main(String[] args) 
    {
        int days = 550;
        //int yr = days / 365;
        //int month = yr * 12;
        double years = days/365.0;
        double months = years * 12;
        System.out.println("Days : "+days);
        System.out.println("Year : "+years);
        System.out.println("Months : "+months);
    }
    
}
