class Solution {
    public int findShortestSubArray(int[] nums) {
        
        if(nums.length == 1) return 1;
        
        
        int degree = 0;
        
        Map<Integer,Integer> map = new HashMap();
        Map<Integer,Integer> left = new HashMap<>();
        Map<Integer,Integer> right = new HashMap<>();
        
        for(int i= 0 ;i< nums.length ;i++){
            int num = nums[i];
            if(left.get(num) == null)
                left.put(num,i);
            right.put(num,i);
            
            int value = map.getOrDefault(num,0)+1;
            degree = Math.max(degree,value);
            map.put(num,value);
        }
        int minLen = nums.length;
        
        for(int num: map.keySet()){
            
            if(map.get(num) == degree)
            {
                int len = right.get(num)-left.get(num) +1;
                minLen = Math.min(len,minLen); 
            }
        }
        
        return minLen;
    }
    
    
}