class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int low=0;
        int high = nums.length -1;
        int mid;
        while ( low <= high) {
            mid = low + (high - low) /2;   
            System.out.printf(" low = %d\thigh=%d\tmid=%d\n", low,high,mid);
            if ( nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {                
                high = mid -1;                
            } else {
                low = mid +1;
            }
        }
        return low;
    }
}