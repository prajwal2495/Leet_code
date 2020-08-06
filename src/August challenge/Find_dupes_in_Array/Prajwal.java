class Solution
{
    public List<Integer> findDuplicates(int[] nums)
    {
        List<Integer> dupes= new ArrayList<>();
        for (int i = 0; i < nums.length; i++)
        {
            /* flip the ith number to negative and if i-1th number is already negative
            then that number is a duplicate
            This works because of the condition on the data in array
            i.e., Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array)
             */

            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0)
                dupes.add(Math.abs(index + 1));

            nums[index] = -nums[index];
        }

        return dupes;

    }
}