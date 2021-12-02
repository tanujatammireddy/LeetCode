class Solution {
    public boolean isMonotonic(int[] nums) {
        
        if(nums.length == 1) return true;
        int value = 0;
        for(int i= 1; i< nums.length  ;i++){
            int c = Integer.compare(nums[i-1],nums[i]);
            if(c != 0){
                if(c != value && value != 0)
                    return false;
                value = c;
            }
        }
        
        return true;
    }
}