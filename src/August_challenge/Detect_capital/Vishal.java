public class DectectCapital {

    public boolean detectCapitalUse(String word) {

        String wordUpper = word.toUpperCase();

        String wordLower = word.toLowerCase();


        if(word.equals(wordUpper) || word.equals(wordLower)) {
            return true;
        }

        String firstLetter = word.substring(0, 1);
        String otherThanFirstLetter = word.substring(1, word.length());

        if (firstLetter.equals(firstLetter.toUpperCase()) && otherThanFirstLetter.equals(otherThanFirstLetter.toLowerCase())) {
            return true;
        }

        return false;
    }

}
