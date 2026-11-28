import java.util.Arrays;

public class RameshwaraCafe 
{
    public static int getMinimumSeatingCapacity(int[] orderTimeStamps)
    {
        if (orderTimeStamps == null || orderTimeStamps.length == 0)
            return -100;

        Arrays.sort(orderTimeStamps);

        int minSeatingCapacity = 0;
        int occupiedSeats = 0;
        int left = 0;

        for (int right = 0; right < orderTimeStamps.length; right++)
        {
            if (right > 0 && orderTimeStamps[right] == orderTimeStamps[right - 1])
                continue;

            occupiedSeats++;

            while (left < right)
            {
                if (left > 0 && orderTimeStamps[left] == orderTimeStamps[left - 1])
                {
                    left++;
                    continue;
                }

                if (addTenMinutes(orderTimeStamps[left]) <= orderTimeStamps[right])
                {
                    occupiedSeats--;
                    left++;
                }
                else
                {
                    break;
                }
            }
            minSeatingCapacity = Math.max(minSeatingCapacity, occupiedSeats);
        }

        return minSeatingCapacity;
    }


    public static int getMinSeatingCapacity(int[] orderTimeStamps)
    {
        if (orderTimeStamps == null || orderTimeStamps.length == 0)
            return -100;

        Arrays.sort(orderTimeStamps);

        int occupied = 0;
        int finished = 0;
        int currentSeatCount = 0;
        int maxSeatsSofar = 0;

        while (occupied < orderTimeStamps.length)
        {
            while (occupied < orderTimeStamps.length - 1 && orderTimeStamps[occupied] == orderTimeStamps[occupied + 1])
                occupied++;

            while (finished < orderTimeStamps.length - 1 && orderTimeStamps[finished] == orderTimeStamps[finished + 1])
                finished++;

            if (orderTimeStamps[occupied] <= addTenMinutes(orderTimeStamps[finished]))
            {
                currentSeatCount++;
                occupied++;
                maxSeatsSofar = Math.max(maxSeatsSofar, currentSeatCount);
            }
            else
            {
                currentSeatCount--;
                finished++;
            }
        }

        return maxSeatsSofar;
    }

    public static int addTenMinutes(int time)
    {
        if (time % 100 < 50)
            return time + 10;
        return time + 50;
    }

    public static void main(String[] args) 
    {
        int[] orderTimeStamps = {600, 600, 601, 601, 601, 615, 616, 616, 617, 617};

        System.out.println(getMinimumSeatingCapacity(orderTimeStamps));
        System.out.println(getMinSeatingCapacity(orderTimeStamps));
    }
}
