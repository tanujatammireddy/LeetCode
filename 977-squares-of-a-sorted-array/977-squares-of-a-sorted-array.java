class Solution {
    public int[] sortedSquares(int[] nums) {
     
        if(nums[0] < 0){
            
            int idx = nums.length-1;
            int negativeIndex = 0;
            int positiveIndex = nums.length-1;
            int[] result = new int[nums.length];
            
            while(negativeIndex < positiveIndex){
                
                if(nums[positiveIndex] > Math.abs(nums[negativeIndex]) ){
                    result[idx] = nums[positiveIndex]* nums[positiveIndex];
                    positiveIndex--;
                }
                else{
                    result[idx] = nums[negativeIndex]* nums[negativeIndex];
                    negativeIndex++;
                }
                idx--;
            }
            if(negativeIndex == positiveIndex)
                result[idx] = nums[negativeIndex]* nums[negativeIndex];
            
            return result;
       
        }
        else
        {
            for(int i=0;i< nums.length;i++){
                nums[i] *= nums[i];
            }
        }
        
        return nums;
    }
}