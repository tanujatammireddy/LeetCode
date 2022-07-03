public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        
        int reverse = 0;
        int count = 0;
        
        while(count++ <32){
            
            // left shift on reverse to add new digits
            reverse = reverse << 1;
            
            if(n != 0){
                // (n & 1) checks if there is 1 in the end of n 
                // '|' added digit to the reverse 
                
                reverse = (n&1) | reverse;
                // right shift on input to get the digit to be added.
                n = n >> 1;
            }
            
        }
        return reverse;
        
    }
}