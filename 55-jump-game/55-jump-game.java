class Solution {
    public boolean canJump(int[] nums) {
        
        if(nums.length == 0) return false;
        if(nums.length == 1) return true;
        
        int max_reach = nums[0];
        for(int i=1;i< nums.length;i++){
            if(max_reach < i) return false;
            max_reach = Math.max(nums[i] + i,max_reach);
        }
        
        return true;
        
    }
}