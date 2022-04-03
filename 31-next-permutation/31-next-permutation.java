class Solution {
    public void nextPermutation(int[] nums) {
        
        if(nums.length == 1)
            return;
        if(nums.length == 2){
            swap(nums,0,1);
            return;
        }
        int pointer = nums.length-2;
        
        while(pointer >= 0 && nums[pointer] >= nums[pointer+1]){
            pointer--;
        }
        if(pointer >=0 ){
            
            int idx = nums.length-1;
            while(nums[idx] <= nums[pointer]){
                idx--;
            }
            swap(nums,pointer,idx);
        }
        reverse(nums,pointer+1);
        
        
    }
    
    public void swap(int[] nums, int pos1, int pos2){
        int temp = nums[pos1];
        nums[pos1] = nums[pos2];
        nums[pos2] = temp;
        
    }
    
    public void reverse(int[] nums, int start){
        
        int i= start;
        int j= nums.length-1;
        
        while(i< j){
            swap(nums,i,j);
            i++;
            j--;
        }
        
    }
}