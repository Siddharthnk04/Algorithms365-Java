import java.util.*;

public class MergeMeetingIntervals 
{
    static int[][] mergeMeetingIntervals(int[] start, int[] end)
    {
        if (start == null || end == null || start.length!= end.length || start.length == 0)
            return new int[0][2];

        int[][] intervals = new int[start.length][2];

        for (int i = 0; i < start.length; i++)
        {
            intervals[i][0] = start[i];
            intervals[i][1] = end[i];
        }

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        int currentStart = intervals[0][0];
        int currentEnd = intervals[0][1];

        ArrayList<int[]> list = new ArrayList<>();

        for (int i = 1; i < intervals.length; i++)
        {
            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];

            if (nextStart <= currentEnd)
                currentEnd = Math.max(currentEnd, nextEnd);
            else
            {
                list.add(new int[] {currentStart, currentEnd});
                currentStart = nextStart;
                currentEnd = nextEnd;
            }
        }

        list.add(new int[] {currentStart, currentEnd});

        return list.toArray(new int[0][]);
    }

    public static void main(String[] args) 
    {
        int[] start = {1, 2, 8, 15};
        int[] end   = {3, 6, 10, 18};

        System.out.println(Arrays.deepToString(mergeMeetingIntervals(start, end)));    
    }
}
