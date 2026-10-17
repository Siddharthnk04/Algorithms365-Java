public class LongestTemperatureStretch 
{
    static int longestRisingTemperatureStretch(int[] temperature)
    {
        if (temperature == null || temperature.length == 0)
            return -1;
        int longestStretch = 0;
        int count = 1;

        for (int i = 1; i < temperature.length; i++)
        {
            if (temperature[i] > temperature[i - 1])
            {
                count++;
            }
            else
            {
                if (count > longestStretch)
                {
                    longestStretch = count;
                    count = 1;
                }
            }
        }

        return longestStretch;
    }

    public static void main(String[] args) 
    {
        int[] temperature = {3, 4, 5, 2, 3, 4, 5, 6, 1};

        System.out.println(longestRisingTemperatureStretch(temperature));
    }
}
