class Solution {
    public int[] countBits(int n) {
        
        int[] result = new int[n+1];
        result[0] = 0;
        int twoPower = 2;
        int previousTwoPower = 2;
        if(n > 0){
            result[1] = 1;
        
            for(int i= 2; i<= n;i++){
                if(i== twoPower){
                    result[i] = 1;
                    previousTwoPower = twoPower;
                    twoPower *= 2;
                }
                else
                    result[i] =  1 + result[i-previousTwoPower];
            
        }
        }
        
        

        
        return result;
    }
}