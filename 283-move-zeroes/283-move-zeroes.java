class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        
        if(len <= 1)
            return;
        int idx = 0;
        int zeroCount = 0;
        int i=0;
        while(i< len){
            
            while(i< len && nums[i] == 0){
                zeroCount++;
                i++;
            }
            if(i< len && nums[i] != 0){
                nums[idx] = nums[i];
                idx++;
                i++;
            }
        }
        len--;
        while(zeroCount > 0){
            nums[len] = 0;
            len--;
            zeroCount--;
        }
        
    }
}