class Solution {
    public String truncateSentence(String s, int k) {
        int empty_count = 0;
        int index=0;
        for(int i = 0; i<s.length(); i++){
            
            if(empty_count==k){
                index = i;
                break;
            }
            
            if (s.charAt(i)==' '){
                empty_count++;
            }
            
        }
        if(index == 0) return s;
        return s.substring(0, index-1);
    }
}