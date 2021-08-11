class Solution {
    public boolean search(int[] nums, int target) {
        if(nums.length == 0) return false;
        boolean returnValue = false;
        int start =0, end = nums.length-1;
        //sorted
        if(nums[start] < nums[end]){
            
            while(start < end){
                int mid = start +(end-start)/2;
                if(nums[mid] == target|| nums[start]==target || nums[end]==target){
                    return true;
                }
                else if(mid == start || mid == end){
                    break;
                }
                else{
                    if(target < nums[mid] ){
                      end = mid;  
                    }
                    else if(target > nums[mid] ){
                        start= mid;
                    }
                } 
            }
            
        }//Rotated
        else{
            if(target <= nums[end]){
                while(end>= 0 && target <= nums[end]){
                    
                    if(nums[end]== target){
                        return true;
                    }
                    if(end-1 >= 0 && nums[end-1] > nums[end]){
                        break;
                    }
                    end--;
                }
            }
            else{
                while(start< nums.length && target >= nums[start]){
                    if(nums[start]== target){
                        return true;
                    }
                    if(start+1 < nums.length && nums[start+1] < nums[start]){
                        break;
                    }
                    start++;
                }
            }
            
        }
            
        return returnValue;
            
    }
}