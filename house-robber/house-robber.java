class Solution {
    public int rob(int[] nums) {
        
        if(nums.length == 1) return nums[0];
        
        int n = nums.length;
        Integer[]dp = new Integer[n];
        return Math.max(dp(nums,n-2,dp),dp(nums,n-1,dp));
        
    }
    public int dp(int[] nums, int n ,Integer[]dp){
        if(n < 0) return 0;
        if(n == 0) return nums[0];
        if(n == 1) return nums[1];
        if(dp[n] != null)
            return dp[n];
        dp[n] = Math.max(dp(nums,n-2,dp),dp(nums,n-3,dp)) + nums[n];
        return dp[n];
    }
}