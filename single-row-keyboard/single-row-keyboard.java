class Solution {
    
    public int calculateTime(String keyboard, String word) {
        
        int[] charArray = new int[26];
        int time = 0; 
        for(int i=0;i< keyboard.length() ;i++){
           charArray[keyboard.charAt(i)-'a'] = i; 
        }
        
        int previous_pos = 0;
        for(char ch:word.toCharArray()){
            int current_pos = charArray[ch-'a']; 
            time += Math.abs(current_pos-previous_pos);
            previous_pos = current_pos;
        }
        
        return time;
    }
}