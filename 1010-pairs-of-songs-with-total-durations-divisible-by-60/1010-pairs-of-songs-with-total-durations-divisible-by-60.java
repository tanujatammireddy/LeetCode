class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        
        int[] remainder = new int[60];
        int count =0;
        for(int t: time){
            
            int rem = t%60;
            if(rem == 0)
                count += remainder[0] ;
            else
                count += remainder[60-rem];
                
            remainder[rem]++; 
        }
        
        return count;
        
    }
}