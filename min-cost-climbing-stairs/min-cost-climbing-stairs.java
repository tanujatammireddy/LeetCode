class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int steps = cost.length;
        Integer[] dp = new Integer[steps];
        return Math.min(fill_array(cost,dp,steps-1), fill_array(cost,dp,steps-2));
    }
    public int fill_array(int[] cost, Integer[] dp, int n)
    {   
        if(dp[n] != null)
            return dp[n];
        else if(n<=0)
            dp[n] = cost[0];
        else if(n == 1)
            dp[n] = cost[1];
        else
            dp[n] = Math.min(fill_array(cost,dp,n-1), fill_array(cost,dp,n-2)) + cost[n];
     
        return dp[n];
    }
}