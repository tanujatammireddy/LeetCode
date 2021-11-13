class Solution {
    public int numSplits(String s) {
        
        int numSplits = 0;
        
        HashMap<Character,Integer> rightMap = new HashMap();
        HashMap<Character,Integer> leftMap = new HashMap();
        
        for(int i= 0; i<s.length() ;i++){
           rightMap.put(s.charAt(i), rightMap.getOrDefault(s.charAt(i),0)+1);
        }
        
        for(int i= 0; i<s.length() ;i++){
            
            char ch = s.charAt(i);
            int count = rightMap.get(ch);
            
            if(count > 1)
                rightMap.put(ch,count-1);
            else
                rightMap.remove(ch);
            
            leftMap.put(s.charAt(i), leftMap.getOrDefault(s.charAt(i),0)+1);
            
            if(leftMap.keySet().size() == rightMap.keySet().size())
                numSplits++;
        }
        
        return numSplits;
    }
    
    
}