class Solution {
    public int maxChunksToSorted(int[] arr) {
        
        if(arr.length == 1)
            return 1;
        
        int maxChunks = 0;
        if(arr.length > 1){
            
            int max = -1;  
            for(int i= 0;i< arr.length;i++){
                if(arr[i] > max)
                    max = arr[i];
                if(i == max)
                    maxChunks++;
            }
            
        }
        return maxChunks;
    }
}