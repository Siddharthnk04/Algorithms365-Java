public class Seating 
{
    public static void main(String[] args) 
    {
        int totalAudiance = 125; 
        int seatsPerRow = 12;

        int competeRows = totalAudiance/seatsPerRow;


        System.out.println("Complete Rows : " + competeRows);
        System.out.println();
        System.out.println("People in last row : " + (totalAudiance-competeRows*seatsPerRow));
    }
}
