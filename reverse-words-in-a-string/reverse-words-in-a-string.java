class Solution {
    public String reverseWords(String s) {
        
        String[] words = s.split(" ");
        
        StringBuilder sb = new StringBuilder();
        
        for(int i= words.length-1 ;i>=0;i--){
            String str = words[i].trim();
            if(!str.isEmpty()){
                sb.append(str);
                sb.append(" "); 
            }
            
        }
        return sb.toString().trim();
        
    }
}