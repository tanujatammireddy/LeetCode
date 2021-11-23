class Solution {
    
   
    public int climbStairs(int n) {
        
         Integer[] dp = new Integer[n+1];
        return count(dp,n);
        
    }
    public int count(Integer[] dp, int n){
        
        if(dp[n] != null)
            return dp[n];
        if(n <= 0)
            return 0;
        else if(n == 1)
            dp[n] = 1;
        else if(n == 2)
            dp[n] = 2;
        else
            dp[n] = count(dp,n-1) + count(dp,n-2);
        
        return dp[n];
        
        
    }
}