class Solution {
    public int search(int[] nums, int target) {
        int start= 0, end = nums.length-1;
        while(start <= end){
            if(nums[start]== target) return start;
            if(nums[end]== target) return end;
            if(target > nums[start])
            start++;
            else
            end--;
        }
        return -1;
    }
}