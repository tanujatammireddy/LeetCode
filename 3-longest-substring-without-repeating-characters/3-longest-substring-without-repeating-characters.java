class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int[] map = new int[128];
        int left = 0;
        int right = 0;
        int len = s.length();
        if(len <= 1)
            return len;
        int max = Integer.MIN_VALUE;
        
        while( left < len){
            
            while(left < len && map[s.charAt(left)] == 0){
                map[s.charAt(left)]++;
                left++;
            }
            
            while(right < left){
                int right_count = map[s.charAt(right)]--;
                right++;
                if(right_count == 1)
                    break;
            }
            
            //System.out.print("left "+left+" right "+right);
            
            max = Math.max(max, left-right+1);
        }
        return max;
        
    }
}