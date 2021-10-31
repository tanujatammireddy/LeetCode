class Solution {
    
    public int coinChange(int[] coins, int amount) {
        
        Integer[] dp = new Integer[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0] = 0;
        for(int i= 1; i<= amount; i++){
            for(int j = 0; j < coins.length ; j++){
                if(i >= coins[j]){
                    dp[i] = Math.min(dp[i],dp[i-coins[j]]+1);
                }
            }
        }
        return (dp[amount] == amount+1)? -1: dp[amount] ;
    }
    
}