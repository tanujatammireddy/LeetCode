class Solution {
    public void nextPermutation(int[] nums) {
        boolean flag = false;
        
        if(nums.length > 1){
            int i = nums.length-1;
            while(i-1 >= 0 && nums[i-1] >= nums[i])
                i--;
            int decreasingPoint = i-1;  
            if(decreasingPoint>=0){
                int j = nums.length-1;
                while (j>=0 && nums[j] <= nums[decreasingPoint]) 
                j--;
                if(j>=0)
                swap(nums,decreasingPoint,j);
            }
            reverse(nums,i);
            
            
        }
    }
    public void swap(int[]nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        
    }
    public void reverse(int[]nums, int i){
        int start = i, end = nums.length-1;
        while(start< end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    
}