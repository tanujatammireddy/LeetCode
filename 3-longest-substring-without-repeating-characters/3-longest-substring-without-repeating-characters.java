class Solution {
   public int lengthOfLongestSubstring(String s) {
        
        int len = s.length();
        if(len <= 1)
            return len;
        
        int left =0;
        int right = 0;
        int[] arr = new int[128];
        int maxLength = 0;
        
        while(right < len){
            
            arr[s.charAt(right)]++;
            while(arr[s.charAt(right)] >1 )
            {
                arr[s.charAt(left)]--;
                left++;
            }
            right++;
            maxLength = Math.max(maxLength,(right-left));
        }
        
        return maxLength;
        
    }
}