class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 1) return true;
        int[] dp = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int current = nums[i];
            int j=i+1;
            while(j< nums.length && current !=0){
                dp[j]++;
                j++;
                current--;
            }
            if(i+1< nums.length && dp[i+1] == 0) return false;
        }
        if(dp[nums.length-1] == 0)
        return false;
        else
            return true;
    }
}