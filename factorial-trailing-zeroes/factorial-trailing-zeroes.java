class Solution {
    public int trailingZeroes(int n) {
        
        int count = 0;
        int N = 5;
        
        while(n/N > 0){
            count = count+ n/N;
            N = N*5;
        }
        
        return count;
        
    }
}