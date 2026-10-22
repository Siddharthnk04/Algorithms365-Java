import java.util.*;

public class MinimumTrainPlatforms 
{

    //Bruteforce : assuming lengths are same and no overnight trains.
    static int findMinimumPlatrormsBruteforce(int[] arrival, int[] departure)
    {
        int minimumPlatform = 0;

        for (int i = 0; i < arrival.length; i++)
        {
            int count = 1;

            for (int j = 0; j < arrival.length; j++)
            {
                if (i == j)
                    continue;

                if (arrival[j] <= arrival[i] && departure[j] > arrival[i])
                    count++;
            }

            minimumPlatform = Math.max(minimumPlatform, count);
        }

        return minimumPlatform;
    }


    // Sorting + Two Pointers
    static int minimumPlatrormsRequired(int[] arrival, int[] departure)
    {
        Arrays.sort(arrival);
        Arrays.sort(departure);

        int occupiedPlatforms = 0;
        int minimumPlatform = 0;
        int arrivalIndex = 0;
        int departureIndex = 0;

        while (arrivalIndex < arrival.length)
        {
            if (arrival[arrivalIndex] < departure[departureIndex])
            {
                occupiedPlatforms++;
                arrivalIndex++;

                minimumPlatform = Math.max(minimumPlatform, occupiedPlatforms);

            }
            else 
            {
                occupiedPlatforms--;
                departureIndex++;
            }
        }

        return minimumPlatform; 
    }


    //Extra Array + Running Sum
    static int findMinimumPlatformsRequired(int[] arrival, int[] departure)
    {
        // Convert time to minutes
        for (int i = 0; i < arrival.length; i++)
        {
            arrival[i] = (arrival[i] / 100) * 60 + (arrival[i] % 100);
            departure[i] = (departure[i] / 100) * 60 + (departure[i] % 100);
        }

        //There are 1440 minutes in a day
        int[] timeLine = new int[1440];

        for (int i = 0; i < arrival.length; i++)
        {
            timeLine[arrival[i]]++;
            timeLine[departure[i]]--;
        }

        int minimumPlatrormsRequired = 0;
        int occupiedPlatforms = 0;

        for (int i = 0; i < timeLine.length; i++)
        {
            occupiedPlatforms += timeLine[i];

            if (timeLine[i] > 0)
                minimumPlatrormsRequired = Math.max(minimumPlatrormsRequired, occupiedPlatforms);
        }

        return minimumPlatrormsRequired;
    }

    public static void main(String[] args) 
    {
        int[] arrival = {900, 915, 930, 1000};
        int[] departure = {1000, 945, 1030, 1100};

        // System.out.println(findMinimumPlatrormsBruteforce(arrival, departure));
        // System.out.println(minimumPlatrormsRequired(arrival, departure));

        System.out.println(findMinimumPlatformsRequired(arrival, departure));
    }
}
