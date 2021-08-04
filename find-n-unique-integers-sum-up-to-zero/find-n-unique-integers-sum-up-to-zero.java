class Solution {
    public int[] sumZero(int n) {
        int[] returnArray = new int[n];
        if(n%2 ==1 ){
            returnArray[n-1] = 0;
            n = n-1;
        }
        int currentValue = 1;
        for(int i=0; i<n; i++){
            
            returnArray[i] = currentValue;
            i++;
            returnArray[i] =  -1 * currentValue;
            currentValue++;
        }
        return returnArray;
    }
}