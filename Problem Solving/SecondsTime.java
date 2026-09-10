class SecondsTime 
{
    public static void main(String[] args) 
    {
        int sec = 3600;
        int hours = sec/(60*60);
        int minutes = sec/60;

        System.out.println(sec + " seconds : "+ hours + " hours");
        System.out.println(sec + " seconds : "+ minutes + " minutes");

    }
    
}
