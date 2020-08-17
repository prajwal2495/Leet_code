class Solution
{
    public int[] distributeCandies(int candies, int num_people)
    {
        int result[] = new int[num_people];
        int availableCandies = 1;

        while(candies > 0)
        {
            for (int i = 0; i < num_people; i++)
            {
                if(candies > availableCandies)
                {
                    result[i] += availableCandies;
                    candies -= availableCandies;
                    availableCandies++;
                }
                else
                {
                    arr[i] += candies;
                    candies = 0;

                }

            }
        }
        return result;
    }
}