class Solution {
    public int climbStairs(int n) {
        
        int[] memo = new int[n+1];
        return climbStairWays(0,n,memo);
    }
    
    public int climbStairWays(int i,int n, int[] memo){
        
        if(i == n) return 1;
        if(i > n) return 0;
        if(memo[i] > 0) return memo[i];
        
        memo[i] = climbStairWays(i+1,n,memo) +  climbStairWays(i+2,n,memo);
        
        return memo[i];
    }
}