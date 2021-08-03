class Solution {
    public int searchInsert(int[] nums, int target) {
        int start =0, end = nums.length-1,current;
        while(start <= end){
            current = start +(end-start)/2;
            //System.out.println("start: "+start+" end: "+end+" current: "+current);
            if(nums[current]== target)
                return current;
            if(nums[current] < target ) 
                start = current+1;
            else
                end = current-1;
        }
        
        return start;
    }
}