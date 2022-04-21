class Solution {
    public int mySqrt(int x) {
        
        if(x <= 1)
            return x;
        int low = 2;
        int high = x/2;
        int mid = 0;
        
        while(low <= high){
            
            mid = (low)+(high-low)/2;
             
            long val = (long) mid*mid;
            
            if( val == x)
                return mid;
            
            if(val > x)
                high = mid-1;
            else
                low = mid+1;
            
        }
        //System.out.println("low"+low+" high"+high+" mid"+mid);
            
        return low-1;
    }
}