class Solution {
    public boolean detectCapitalUse(String word) {
        int capital_count = 0;
        
        if(word.length() == 1) return true;
        
        for(int i = 0; i<word.length(); i++){
            
            if(word.charAt(i) >= 'A' && word.charAt(i)<='Z') capital_count++;            
        }
                
        if(capital_count == 1 && (word.charAt(0) >= 'A' && word.charAt(0)<='Z')) return true;       
        if(capital_count == 0) return true;
        if(capital_count == word.length()) return true;
        return false;
    }
}