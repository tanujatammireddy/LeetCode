class Solution {
    public int[] countBits(int n) {
        
        int[] result = new int[n+1];
        result[0] = 0;
        int two_power = 2;
        
        if(n > 0){
            result[1] = 1;
        
            for(int i= 2; i<= n;i++){
                if(i== two_power){
                    result[i] = 1;
                    two_power *= 2;
                }
                else
                    result[i] =  1 + result[i-two_power/2];
            
        }
        }
        
        

        
        return result;
    }
}