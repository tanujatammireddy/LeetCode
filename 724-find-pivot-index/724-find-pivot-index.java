class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefix = new int[nums.length];
        
        for ( int i=0; i<nums.length ; i++) {
            if ( i==0) {
                prefix[i] = nums[i];
            } else {
                prefix [i] = nums[i]+ prefix[i-1];
            }
        }
        
      for ( int i=0; i<nums.length; i++) {
          
          if (i ==0 ){
              if(0==( prefix[nums.length-1] - prefix[i])){       
              
           return 0;  
              }
 
          } else if( prefix[nums.length-1] - prefix[i] == prefix[i-1]){
             return i;
          }
          }
       return -1;
    }
}