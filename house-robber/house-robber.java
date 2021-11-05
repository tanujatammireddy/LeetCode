class Solution {
    public int rob(int[] nums) {
      int houses = nums.length;
      Integer[] dp = new Integer[houses];
      return Math.max(fill_array(nums,dp,houses-2), fill_array(nums,dp,houses-1)); 
    }
    public int fill_array(int[] nums, Integer[] dp, int n)
    {   
        if(n< 0)
            return 0;
        if(n==0)
            return nums[0];
        if(n == 1)
            dp[n] = nums[1];
        if(dp[n] != null)
            return dp[n];
        else
            dp[n] = Math.max(fill_array(nums,dp,n-2), fill_array(nums,dp,n-3)) + nums[n];
     
        return dp[n];
    }
}