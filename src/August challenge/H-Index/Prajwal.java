class Solution {
    public int hIndex(int[] citations) {

        int size = citations.length;
        Arrays.sort(citations); // sorry but not sorry

        for(int i = 0; i < size; i++)
        {
            if(citations[i] >= size - i)
                return size - i;
        }

        return 0;

    }
}