class Solution {
    public void moveZeroes(int[] nums) {
    int count = 0;
    int j = 0;
        for( int i=0; i<nums.length ;i++){
            if(nums[i]== 0)
                count++;
            else
            {
                nums[j] = nums[i];
                j++;
            }
            
        }
    for(int k= nums.length-1; count > 0 ;k--){
        nums[k]=0;
        count--;
    }
    }
        
}