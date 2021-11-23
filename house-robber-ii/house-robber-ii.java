class Solution {
    public int rob(int[] nums) {
        
        int n = nums.length;
        if(n == 1)
            return nums[0];
        return Math.max( max(0,n-1,nums),max(1,n,nums) );
        
    }
    
    private int max(int start, int end, int[] nums){
        
        int[] dp = new int[end+1];
        dp[end] = 0;
        dp[end-1] = nums[end-1];
        for(int i= end-2; i>= start ; i--){
            dp[i] = Math.max(dp[i+1], dp[i+2] + nums[i]);
        }
        return dp[start];
    }
}