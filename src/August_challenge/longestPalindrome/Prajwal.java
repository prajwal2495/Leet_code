class Solution
{
    public int longestPalindrome(String s)
    {
        Set<Character> ListOfChars = new HashSet<>();
        int longestSubString = 0;

        for(char c : s.toCharArray())
        {
            if(ListOfChars.contains(c))
            {
                ListOfChars.remove(c);
                longestSubString += 2;
            }
            else
                ListOfChars.add(c);


        }

        return ListOfChars.size() > 0 ? longestSubString + 1 : longestSubString;
    }
}