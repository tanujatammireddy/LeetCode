class Solution {
    public int deleteAndEarn(int[] nums) {
        
        int[] array = new int[10001]; // num value lies between 1 and 10,000
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num:nums) {
            array[num] = array[num] + num;
            max = Math.max(max,num);
            min = Math.min(min,num);
        }
        
        Integer[] dp = new Integer[max+1];
        return Math.max(fill(array,dp,max),fill(array,dp,max-1));
    }
    public int fill(int[] array,Integer[] dp,int n){
        if(n < 0) return -1;
        if(n == 0) return array[0];
        if(n == 1) return array[1];
        if(dp[n] != null ) return dp[n];
        dp[n] = Math.max( fill(array,dp,n-2),  fill(array,dp,n-3) ) + array[n];
        return dp[n];
    }
}