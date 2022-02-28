class Solution {
    public void rotate(int[] nums, int k) {
        
        int len = nums.length;
        if(k == len)
            return;
        k = k%len;
        len--;
        reverse(0,len,nums);
        reverse(0,k-1,nums);
        reverse(k,len,nums);
        
    }
    
    public void reverse(int start, int end, int[] nums){
        
        while(start < end){
            
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}