class Solution {
    public int maxSubArrayLen(int[] nums, int k) {
        
        Map<Integer,Integer> map = new HashMap();
        
        int prefix = 0;
        int maxSubArrayLen = 0;
        
        for(int i=0;i<nums.length ;i++){
            
            prefix += nums[i]; 
            
            if(prefix == k)
               maxSubArrayLen = i+1; 
            
            if(map.containsKey(prefix-k))
                maxSubArrayLen = Math.max(maxSubArrayLen, i- map.get(prefix-k));
            if(nums[i] == k)
                maxSubArrayLen = Math.max(maxSubArrayLen, 1);
            if(!map.containsKey(prefix))
                map.put(prefix,i);
        }
        
        return maxSubArrayLen ;
        
    }
}