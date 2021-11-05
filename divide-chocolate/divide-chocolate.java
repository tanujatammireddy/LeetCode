class Solution {
    public int maximizeSweetness(int[] sweetness, int k) {
        
        int low = 1;
        int high = Arrays.stream(sweetness).sum()/(k+1);
        
        while(low < high){
            int mid = (low + high +1)/2;
            if(canSplit(sweetness,mid,k))
                low = mid;
            else
                high = mid-1;
        }
        
        return low;
    }
    
    public boolean canSplit(int[] sweetness, int mid, int k){
        
        int chuncks =0, sum = 0;
        for(int i=0; i< sweetness.length; i++){
            sum += sweetness[i];
            if(sum >= mid){
                chuncks++;
                sum =0;
            }
        }
    if(chuncks >= k+1)
        return true;
    else
        return false;
}
}