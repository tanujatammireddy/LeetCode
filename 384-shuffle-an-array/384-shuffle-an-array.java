class Solution {
    
    private int[] orginal;
    private int[] arr;
    Random rand = new Random();
    
    public Solution(int[] nums) {
        orginal = nums.clone();
        arr = nums;
    }
    
    public int[] reset() {
       arr = orginal;
       orginal = orginal.clone();
       return  orginal;
    }
    
    public int[] shuffle() {
        
        for(int i= 0; i< arr.length; i++){
            swap(i,randomIndex(i,arr.length));
        }
        return arr;
    }
    private void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j] ;
        arr[j] = temp;
        
    }
    private int randomIndex(int min, int max){
        return rand.nextInt(max- min) + min;
    }
}