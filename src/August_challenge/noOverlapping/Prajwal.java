class Solution
{
    public int eraseOverlapIntervals(int[][] intervals)
    {

        if(intervals.length < 2)
            return 0;

        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);

        int count = 0, prev = 0;
        for(int i = 1; i < intervals.length; i++)
        {
            if(intervals[i][0] < intervals[prev][1])//overlap
            {
                count++;

                if(intervals[i][1] < intervals[prev][1])
                    prev = i;

            }

            else
                prev = i;
        }

        return count;
    }
}