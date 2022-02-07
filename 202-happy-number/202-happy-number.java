class Solution {
    
    
    public boolean isHappy(int n) {
        
        Set<Integer> set = new HashSet();
        
        while(n!= 1 && !set.contains(n)){
            set.add(n);
            n = nextValue(n);
        }
        
        return n==1;
    }
    
    public int nextValue(int n){
        int sum = 0;
        
        while(n > 0){
            int current = n%10;
            sum += current*current;
            n = n/10;
        }
        
        return sum;
    }
}