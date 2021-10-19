class Solution {
    public int maximumProduct(int[] nums) {
        
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        
        for(int i=0; i< nums.length;i++){
            
            int current = nums[i];
            if(current >= max1) 
            {
                max3 = max2;
                max2 = max1;
                max1 = current;
            }
            else if(current >= max2 && current < max1 ) {
                max3 = max2;
                max2 = current;
            } 
            else if(current >= max3 && current < max2 )  max3 = current;
            
            if(current <= min1){
                min2 = min1;
                min1 = current;
            }
            else if( current <= min2 && current > min1){
                min2 = current;
            }
            
        }
        
        return Math.max((max1*max2*max3), (min1*min2*max1));
    }
}