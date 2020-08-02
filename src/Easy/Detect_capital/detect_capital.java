class detect_capital {
    public boolean detectCapitalUse(String word) {
        
        int upper_count = 0;
        if( word == null || word.length() == 0)
            return true;
        
        for(char x : word.toCharArray())
            if (Character.isUpperCase(x)) {
                upper_count++;
            }
        return upper_count == word.length()
                || upper_count == 0 || upper_count == 1 && Character.isUpperCase(word.charAt(0));
        
    }
}
}