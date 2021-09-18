class Solution {
    public int rob(int[] nums) {
        
        int n = nums.length;
        if(n == 1) return nums[0];
        return Math.max(fill(nums,0,n-1),fill(nums,0,n-2));
    }
    public int fill(int[] nums,int start,int n){
        int house_1 = 0;
        int house_2 = 0;
        int max = -1;
        for(int i= start ;i<=n;i++){
            max = Math.max( house_1+nums[i],house_2); 
            house_1 = house_2;
            house_2 = max;
        }
        return max;
        
    } 
}