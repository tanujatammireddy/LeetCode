class Solution {
    public int lengthOfLIS(int[] nums) {
        
        int len = nums.length;
        int[]  dp = new int[len];
        Arrays.fill(dp, 1);
        int max = 1;
        
        for(int i= 1;i< len ; i++){
            for(int j= i-1 ; j>=0 ;j--){
                if(nums[j] < nums[i]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                    max = Math.max(dp[i],max);
                }
            }
        }
        return max;
    }
}