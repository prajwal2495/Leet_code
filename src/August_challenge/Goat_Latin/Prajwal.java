public class Solution
{
    public String toGoatLatin(String S)
    {
        String[] words = S.split(" ");

        StringBuilder newStr = new StringBuilder();

        String a = "a";

        for(String word : words)
        {

            String newWord ="";

            char startChar = word.charAt(0);

            if(isVowel(Character.toLowerCase(startChar)))
            {

                // rule 1 for vowels
                newWord = word +"ma"  + a;

            }

            else
            {

                newWord = word.substring(1) + startChar + "ma" + a; // rule for consonants

            }

            newStr.append(" "+newWord);

            a = a +"a"; // rule for "a"
        }


        return newStr.toString().substring(1);

    }

    private boolean isVowel(char c)
    {
        // helper method for isVowel check
        return (c=='a'|| c=='e'|| c=='i'|| c=='o'||c=='u');

    }
}