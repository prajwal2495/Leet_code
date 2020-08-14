class CombinationIterator
{

    Queue<String> listOfCombos;

    public CombinationIterator(String characters, int combinationLength)
    {
        listOfCombos = new LinkedList();
        numberOfCombinations(characters, 0, "", combinationLength);
    }

    public void numberOfCombinations(String characters, int start, String characterSoFarFound, int k)
    {
        if (k == 0)
        {
            listOfCombos.add(characterSoFarFound);
            return;
        }

        for(int i = start; i < characters.length(); i++)
        {
            numberOfCombinations(characters, i + 1 , characterSoFarFound + characters.charAt(i), k - 1);
        }
    }

    public String next()
    {
        return listOfCombos.poll();
    }

    public boolean hasNext()
    {
        return !listOfCombos.isEmpty();
    }
}