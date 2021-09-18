class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] memo = new int[n+1];
        memo[0] = 0;
        memo[1] = 0;
        for(int i=2 ;i <= n;i++){
            memo[i] = Math.min( memo[i-1]+cost[i-1] ,memo[i-2]+cost[i-2]);
        }
        return memo[n];
    }
    
}