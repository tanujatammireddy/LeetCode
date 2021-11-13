class Solution {
    public int fib(int n) {
        Integer[] dp = new Integer[n+1];
        return dp(n,dp);
    }
    
    public int dp(int n,Integer[] dp){
        
        if(n<=0)
            return 0;
        if(n == 1)
            return 1;
        if(dp[n] != null)
            return dp[n];
        else
            dp[n] = dp(n-1,dp)+ dp(n-2,dp);
        
        return dp[n];
        
    }
}