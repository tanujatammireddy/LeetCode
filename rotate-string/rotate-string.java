class Solution {
    public boolean rotateString(String s, String goal) {
        
        if(s.length() != goal.length()) return false;
        if(s.equals(goal)) return true;
        
        boolean returnValue = false;
        int d=1;
        
        while(d< s.length()){
            
            String s1 = s.substring(d) + (s.substring(0, d)) ;
            //System.out.println("s1"+s1);
            if(s1.equals(goal)) return true;
            d++;
        }
        
        return returnValue;
        
    }
}