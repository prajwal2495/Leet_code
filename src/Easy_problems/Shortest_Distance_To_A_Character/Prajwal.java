class Solution
{
    public int[] shortestToChar(String s, char c)
    {
        int size = s.length();
        int[] distance = new int[size];

        for (int i = 0; i < size; i++)
        {
            if (s.charAt(i) == c)
                continue;

            distance[i] = Integer.MAX_VALUE;
        }


        for (int i = 0; i < size-1; i++)
        {
            if (distance[i] == Integer.MAX_VALUE)
                continue;

            else
                distance[i + 1] = Math.min(distance[i+1], distance[i] + 1);
        }


        for (int i = size-1; i > 0; i--)
        {
            distance[i-1] = Math.min(distance[i-1], distance[i] + 1);
        }

        return distance;
    }
}