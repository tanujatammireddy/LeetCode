class Solution {
    public int lengthOfLIS(int[] nums) {
        int max = 1;
        int len = nums.length;
        int[] dp = new int[len];
        Arrays.fill(dp,1);
        
        for(int i= 1; i < len;i++){
            for(int j=0 ;j<i;j++){
                if(nums[i] > nums[j])
                    dp[i] = Math.max(dp[i],dp[j]+1);
               
            }
            max = Math.max(dp[i],max); 
        }
        
        return max;
        
    }
}