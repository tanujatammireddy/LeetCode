class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int left = 0;
        int right = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        
        while(right < nums.length){
            
            while(right < nums.length && sum < target){
                sum += nums[right];
                right++;
            }
            
            if(sum >= target)
            {
               while( sum >= target){
                    
                   if(sum >= target)
                        minLen = Math.min(minLen, right-left);
                   
                    sum -= nums[left];
                    left++;
                    
                }
                
            }
            else
                break;
            
        }
        return minLen == Integer.MAX_VALUE ? 0:minLen;
        
    }
}