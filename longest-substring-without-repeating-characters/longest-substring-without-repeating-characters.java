class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int[] map = new int[128];
        int len = s.length();
        if(len < 2) return len;
        int left = 0, right = 0;
        int max = 0;
        while(right < len){
            
            char ch = s.charAt(right);
            map[ch]++;
            
            while(map[ch] > 1){
                char left_ch = s.charAt(left);
                map[left_ch]--;
                left++;
            }
            max = Math.max(max, (right-left+1));
            right++;
        }
        
        return max; 
    }
}