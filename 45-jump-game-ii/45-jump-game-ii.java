class Solution {
    //. Dyanmic Programing
    public int jump(int[] nums) {
        
        if(nums.length <= 1)
            return 0;
        
        int[] dp = new int[nums.length];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        
        for(int i=0;i< nums.length ;i++){
            
            int steps = 1;
            
            while(steps <= nums[i] && steps+i < nums.length){
                dp[i+steps] = Math.min(dp[i+steps],dp[i]+1);
                steps++;
            }
        }
        
        return dp[nums.length-1];
    }
}