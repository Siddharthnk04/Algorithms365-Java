class Percentage 
{
    public static void main(String[] args) 
    {   
        int sub1 = 82;
        int sub2 = 98;
        int sub3 = 95;
        int sub4 = 89;
        int sub5 = 100;

        int total = sub1+sub2+sub3+sub4+sub5;

        float average = total/5.0f;

        float percentage = total/500.0f*100;

        System.err.println("Average : " + average);
        System.err.println("Percentage : " + percentage);
        
    }
}
