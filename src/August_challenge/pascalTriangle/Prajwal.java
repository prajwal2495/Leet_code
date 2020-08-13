class Solution
{
    public List<Integer> getRow(int rowIndex)
    {
        List<Integer> result = new ArrayList<>();
        for (int i=0; i <=rowIndex ; i++)
        {
            int j =0;
            while (result.size()-1 > j)
            {
                result.add(result.get(0) + result.get(1));
                result.remove(0);
                j++;
            }

            result.add(1);
        }

        return  result;
    }
}