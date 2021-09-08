class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        
        
        int len = s.length();
        if(k== 0 || len ==0) return 0;
        if(len == 1) return 1;
        
        int max = 1;
        int right = 0 , left = 0;
        int distinct_Characters =0; 
        
        Map<Character,Integer> right_map = new HashMap();
        
        while(left <= right && right < len){
        
        char current = s.charAt(right);
        if(right_map.containsKey(current)){
            right_map.remove(current);
        }
        right_map.put(current,right++);
        if(right_map.size() > k){
            int lowestIndex = Collections.min(right_map.values());
            right_map.remove(s.charAt(lowestIndex));
            left = lowestIndex + 1;
        }
        
           max = Math.max(max, right - left);     
        }    
        return max;
    }

}