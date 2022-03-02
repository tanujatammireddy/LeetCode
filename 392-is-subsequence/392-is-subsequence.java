class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int pointer_1 = 0;
        int pointer_2 = 0;
        
        while(pointer_2 < t.length()){
            
            while(pointer_2 < t.length() && pointer_1 < s.length() && s.charAt(pointer_1) == t.charAt(pointer_2)){
                pointer_1++;
                pointer_2++;
               
            }
            pointer_2++;
            
        }
        
        return (pointer_1 == s.length())? true:false; 
        
    }
}