import java.util.*;

public class MeetingRooms 
{
    static int findMinimunMeetingRooms(int[] start, int[] end)
    {
        if (start == null || end == null || start.length!= end.length || start.length == 0)
            return 0;

        Arrays.sort(start);
        Arrays.sort(end);

        int occupiedMeetingRooms = 0;
        int minimumMeetingRooms = 0;
        int i = 0;
        int j = 0;

        while (i < start.length)
        {
            if (start[i] < end[j])
            {
                occupiedMeetingRooms++;
                i++;

                minimumMeetingRooms = Math.max(minimumMeetingRooms, occupiedMeetingRooms);
            }
            else
            {
                occupiedMeetingRooms--;
                j++;
            }
        }

        return minimumMeetingRooms;
    }

    public static void main(String[] args) 
    {
        int[] start = {0, 5, 15};
        int[] end   = {30, 10, 20};

        System.out.println(findMinimunMeetingRooms(start, end));
    }
}
