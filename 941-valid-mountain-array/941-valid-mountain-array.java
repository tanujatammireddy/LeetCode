class Solution {
    public boolean validMountainArray(int[] arr) {
        
        int i = 1;
        
        while(i < arr.length && arr[i-1] < arr[i]){
            
            if(arr[i-1]== arr[i])
                return false;
            
            else if(arr[i-1] > arr[i]){
                break;
            }
          i++;  
        }
        
        if(i == arr.length || i== 1)
            return false;
        
        while(i < arr.length && arr[i-1] > arr[i]){
            
            if(arr[i-1]== arr[i])
                return false;
            
            else if(arr[i-1] < arr[i]){
                break;
            }
          i++;  
        }
        
        if(i != arr.length)
            return false;
        
        return true;
    }
}