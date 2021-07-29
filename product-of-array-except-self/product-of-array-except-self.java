class Solution {
    public int[] productExceptSelf(int[] nums) {
       int j=0,k=0;
       int[] result = new int[nums.length];
       int[] prefix = new int[nums.length];
       int[] suffix = new int[nums.length];
        
        for(int i=nums.length-1;i>=0;i--){
           if(i== nums.length-1) suffix[i]=1;
           else
                suffix[i] = suffix[i+1]*nums[i+1];
         }
        
        for(int i=0;i<nums.length;i++){
           if(i==0) prefix[i]=1;
           else
              prefix[i] = prefix[i-1]*nums[i-1];
            
            result[i] = prefix[i]*suffix[i];
        }
        return result;
    }
}