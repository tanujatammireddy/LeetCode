class Solution {
    public int rob(int[] nums) {
        
        int n = nums.length;
        if(n == 1) return nums[0];
        Integer[] dp = new Integer[n+1];
        return Math.max(fill(nums,dp,n-1),fill(nums,dp,n-2));
    }
    public int fill(int[] nums,Integer[] dp,int n){
        if(n < 0) return -1;
        if(n == 0) return nums[0];
        if(n == 1) return nums[1];
        if(dp[n] != null ) return dp[n];
        dp[n] = Math.max( fill(nums,dp,n-2),  fill(nums,dp,n-3) ) + nums[n];
        return dp[n];
    } 
}