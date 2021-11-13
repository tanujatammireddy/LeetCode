class Solution {
    public int minDifference(int[] nums) {
        
        int len = nums.length;
        if(len <= 3)
            return 0;
        
        Arrays.sort(nums);
        int minDifference = Integer.MAX_VALUE;
        
        for(int i=0; i<= 3;i++){
            minDifference = Math.min(nums[len-i-1]-nums[3-i],minDifference);
        }
        
        return minDifference;
        
    }
}