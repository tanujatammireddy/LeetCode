class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
        int count = 0;
        int sum = 0;
       
        Map<Integer,Integer> map = new HashMap();
        map.put(0,1);
        
        for(int i=0;i<nums.length;i++){
            
            sum += nums[i];
            int rem = sum%k;
            if(rem < 0)
                rem += k;
            int current_count = map.getOrDefault(rem,0);
            count += current_count;
            map.put(rem,current_count+1);
            
        }
        
        return count;
        
    }
}