public class CountHotterTemperature 
{
    static int countHotterTemperature(int[] temperatures)
    {
        if (temperatures == null || temperatures.length == 0)
            return -1;

        int count = 0;

        for (int i = 1; i < temperatures.length; i++)
        {
            if (temperatures[i] > temperatures[i - 1])
                count++;
        }

        return count;
    }

    public static void main(String[] args) 
    {
        int[] temperatures = {30, 32, 31, 35, 36, 34, 37};

        System.out.println(countHotterTemperature(temperatures));
    }
}
