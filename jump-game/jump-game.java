class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 1) return true;
        if(nums[0] == 0) return false;
        int len = nums.length;
        int max_reach = 0;
        
        for(int i=0;i<nums.length;i++){
            if(max_reach < i) return false;
            max_reach = Math.max(i+nums[i],max_reach);
            
        }
        return true;
    }
}