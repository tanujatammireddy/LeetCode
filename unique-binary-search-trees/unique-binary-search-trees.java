class Solution {
    public int numTrees(int n) {
        
        long c = 1;
        for(int i= 1;i < n; i++){
            c = 2*c*(2*i+1)/(i+2) ;
        }
        return (int)c;
    }
    
}