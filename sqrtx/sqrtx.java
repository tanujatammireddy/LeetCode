class Solution {
    public int mySqrt(int x) {
        
        if(x < 2) return x;
        int left = 2;
        int right = x/2;
        
        while(left <= right){
            
            int current = left + (right-left)/2;
            long num = (long) current* current;
            if(num > x)
                right = current-1;
            else if(num < x)
                left = current+1;
            else
                return current;
                
            
        }
        return right;
    }
}