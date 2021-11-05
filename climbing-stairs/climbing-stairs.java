class Solution {
    
    public int climbStairs(int n) {
        
        Integer[] dp = new Integer[n+1];
        return fill_array(dp,n);
        
    }
    public int fill_array(Integer[] dp,int n)
    {   
        if(dp[n] != null)
            return dp[n];
        else if(n<=0)
            dp[n] = 0;
        else if(n == 1)
            dp[n] = 1;
        else if(n == 2)
            dp[n] = 2;
        else
            dp[n] = fill_array(dp,n-1)+ fill_array(dp,n-2);
     
        return dp[n];
    }
    
}