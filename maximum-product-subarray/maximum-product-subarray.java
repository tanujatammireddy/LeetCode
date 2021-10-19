class Solution {
    
    
    
    public int maxProduct(int[] nums) {
        
        int n = nums.length;
        if(n == 1) return nums[0];
        
        int max_product = nums[0];
        int min_product = nums[0];
        int max_global = nums[0];
        
        boolean zeroFound = false;
        
        for(int i= 1 ;i< n;i++){
            if(nums[i] == 0 ){
                if(i+1 < n){
                max_product = 1;
                min_product = 1;
                }
                zeroFound = true;
                continue;
            }
            else{
            int local_max = max_product;
            max_product = Math.max(max_product*nums[i],Math.max(nums[i],min_product*nums[i]));
            min_product = Math.min(local_max*nums[i],Math.min(nums[i],min_product*nums[i]));
            }
            //System.out.println("max_product"+max_product+"  min_product"+min_product);
            max_global = Math.max(max_global,max_product);
        }
        if(zeroFound)
            return Math.max(max_global,0);
        return max_global;
    }
}