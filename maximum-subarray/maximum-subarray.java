class Solution {
    public int maxSubArray(int[] nums) {
        
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<nums.length ;i++ ){
            int sum = 0;
            
            for(int j=i;j< nums.length; j++){
                sum = sum + nums[j];
                
                if(sum > max)
                    max = sum;
            }
            
        }
        return max;
        
    }
}