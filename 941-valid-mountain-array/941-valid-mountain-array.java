class Solution {
    public boolean validMountainArray(int[] arr) {
        
        boolean peak = false;
        boolean valley = false;
        for(int i= 1;i< arr.length; i++){
            
            if(arr[i-1]== arr[i])
                return false;
            if(arr[i-1] < arr[i]){
                if(valley)
                    return false;
                peak = true;
            }
            if(arr[i-1] > arr[i]){
                valley = true;
                if(!peak)
                    return false;
            }
            
            
            
        }
        
        return valley && peak;
    }
}