class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        
        TreeMap<Integer,List<Character>> map = new TreeMap();
        
        char[] charArray = keysPressed.toCharArray();
        int maxTime = releaseTimes[0];
        char ch = charArray[0];
        
        for(int i=1; i< releaseTimes.length;i++){
            
            int time = releaseTimes[i]- releaseTimes[i-1];
            
            if(time > maxTime){
                maxTime = time;
                ch = charArray[i];
            }
            else if(time == maxTime){
                ch = (ch > charArray[i] )? ch:charArray[i];
            }
            
        }
        
       
        return ch;
    }
}