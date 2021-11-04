class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int low = 0; 
        int high = nums.length-1;
        int[] result = new int[nums.length];
        int index = nums.length-1;
        
        while(index >= 0){
           
            int left = nums[low]* nums[low];
            int right = nums[high]* nums[high];
            
            /*System.out.println("low: "+low+" high"+high);
            System.out.println("left: "+left+" right:"+right);*/
            
            if(left > right)
            {
              result[index] =  left; 
              low++;  
            }
            else{
               result[index] =  right;
                high--;
            }
            
           index--; 
        }
        
        return result;
    }
}