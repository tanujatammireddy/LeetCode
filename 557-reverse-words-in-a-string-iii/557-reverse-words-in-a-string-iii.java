class Solution {
    public String reverseWords(String s) {
        
        String[] words = s.split("\\ ");
        StringBuilder result = new StringBuilder();
        
        for(String word:words){
            StringBuilder sb = new StringBuilder();
            sb.append(word);
            sb.reverse();
            result.append(sb);
            result.append(" ");
        }
            
        
        return result.toString().trim();
    }
    
    
}