class Solution {
    public int waysToMakeFair(int[] nums) {
        int[] se = new int[nums.length];
        int[] so = new int[nums.length];
        
        fill(nums,se,so);   
        int odd;
        int even;
        int count = 0;
        for ( int i=0; i<nums.length; i++) {
            
            if ( i==0) {
                odd = se[nums.length -1] - se[i];
                even = so[nums.length -1] - so[i];
          
            } else {
                odd = se[nums.length -1] - se[i] +so[i-1];
                even = so[nums.length -1] - so[i] + se[i-1];
            }
          if (even ==odd) {
              count++;
          }  
            
        }
        
        
        return count;
    }
    
    private void fill(int[] nums, int[] se, int[] so) {
        
        for ( int i=0; i< nums.length; i++) {
            
            if ( i ==0) {
                se[i] = nums[i];
                so[i] = 0;
            } else if ( i %2 ==0){
                se[i] = nums[i] + se[i-1] ;
                so[i] = so[i-1];
            } else {
                so[i] = so[i-1]+ nums[i];
                se[i] = se[i-1];
            }
        }
    }
}