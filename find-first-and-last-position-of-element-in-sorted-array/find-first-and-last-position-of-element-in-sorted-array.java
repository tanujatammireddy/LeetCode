class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        
        int firstOccurence = -1;
        int secondOccurence = -1;
        
        firstOccurence = occurence(nums,true,false,target);
        
        if(firstOccurence == -1)
            return new int[]{-1,-1};
        else
            secondOccurence = occurence(nums,false,true,target);
        
        return new int[]{firstOccurence,secondOccurence};
        
    }
    public int occurence(int[]nums, boolean firstOccurence, boolean secondOccurence, int target){
        int low = 0;
        int high = nums.length - 1;
        
        while(low <= high){
             
            System.out.println("low"+low+" high"+high);
            
            int mid = low + (high - low)/2;
            System.out.println("mid"+mid);
            
            if(nums[mid] < target ){
                low = mid+1;
            }
            else if( nums[mid] > target ){
                high = mid-1;
            }
            else{
                if(firstOccurence){
                    if( mid == 0 || (mid-1 >= 0 && nums[mid-1] != target))
                        return mid;
                    else
                        high = mid-1;
                        
                }
                if(secondOccurence){
                    if( mid == nums.length-1 ||(mid+1 < nums.length && nums[mid+1] != target) )
                        return mid;
                    else
                        low = mid+1;
                    
                }
                
            }
        }
        
        return -1;
    }
    
    
}
