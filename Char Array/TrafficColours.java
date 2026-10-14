import java.util.Arrays;

public class TrafficColours 
{
    static int[] countTrafficColours(char[] colours)
    {
        if (colours == null || colours.length == 0)
            return new int[] {-1, -1, -1};

        int[] result = new int[3];

        for (char ch : colours)
        {
            if (ch == 'R' || ch == 'r')
                result[0]++;
            else if (ch == 'G' || ch == 'g')
                result[1]++;
            else if (ch == 'Y' || ch == 'y')
                result[2]++;
        }

        return result;
    }

    public static void main(String[] args) 
    {
        char[] colours = {'R','G','G','Y','R','G'};

        System.out.println(Arrays.toString(countTrafficColours(colours)));
    }
}
