class Solution {
    public int climbStairs(int n) {
       Integer[] dp = new Integer[n+1];
        return DP(n,dp);
    }
    public int DP(int n,Integer[] dp){
        if(n <= 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;
        
        if(dp[n] == null)
            dp[n] = DP(n-1,dp) + DP(n-2,dp);
        
        return dp[n];
    }
}