class WordDictionary
{
    class Trie
    {
        Trie[] Alphabets;
        boolean end;
        Trie()
        {
            Alphabets = new Trie[26];
            end = false;
        }
    }

    Trie dict;



    public WordDictionary()
    {
        this.dict = new Trie();
    }



    public void addWord(String word)
    {
        Trie ptr = this.dict;
        for(char c : word.toCharArray())
        {
            if(ptr.Alphabets[c - 'a'] == null)
                ptr.Alphabets[c - 'a'] = new Trie();

            ptr = ptr.Alphabets[c - 'a'];
        }

        ptr.end = true;
    }



    public boolean search(Trie ptr, String word, int index)
    {
        if(index >= word.length()) return ptr.end;
        char c = word.charAt(index);

        if(c == '.')
        {
            for(Trie t : ptr.Alphabets)
            {
                if(t != null && search(t, word,index + 1))
                    return true;
            }

            return false;
        }

        if(ptr == null || ptr.Alphabets[c - 'a'] == null)
            return false;

        return search(ptr.Alphabets[c - 'a'], word, index + 1);
    }


    public boolean search(String word)
    {
        return search(this.dict, word, 0);
    }
}