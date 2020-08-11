class Solution {
    public int titleToNumber(String s)
    {
        int column_number = 0;

        for(int i = 0; i < s.length(); i++)
        {
            column_number *= 26;
            column_number += ((s.charAt(i) - 'A') + 1);
        }
        return column_number;
    }
}