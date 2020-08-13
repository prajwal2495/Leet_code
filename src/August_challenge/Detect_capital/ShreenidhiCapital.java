class Solution {
    public boolean detectCapitalUse(String word) {
        
       int count =0;
       char[] ch = word.toCharArray(); 
       char initial = word.charAt(0);
       
        
        for (char c : ch) { 
            
             if (Character.isUpperCase(c)) {
                count++;
            }          
}
  if (count == 0 || count == word.length())
           {
               return true;
           }
           else if (Character.isUpperCase(initial) && count ==1)
           {
              return true; 
           }
           else 
           {
               return false;
           }   
}
}