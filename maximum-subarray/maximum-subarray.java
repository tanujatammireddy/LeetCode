class Solution {
    public int maxSubArray(int[] nums) {
        int current_subArray = nums[0];
        int max_subArray = nums[0];
        for(int i=1;i<nums.length ;i++){
            current_subArray = Math.max(nums[i],current_subArray +nums[i]);
            max_subArray = Math.max(max_subArray,current_subArray);
        }
        return max_subArray;
    }
}