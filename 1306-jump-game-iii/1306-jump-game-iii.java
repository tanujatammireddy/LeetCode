class Solution {
    
    boolean [] visited;
    public boolean canReach(int[] arr, int start) {
        
        visited = new boolean[arr.length];
        return helper(arr,start);
    }
    
    public boolean helper(int[] arr, int pos){
        
        if(pos >= 0 && pos < arr.length && !(visited[pos])){
            
            if(arr[pos] == 0)
                return true;
            visited[pos] = true;
        
            int new_pos_1 = pos + arr[pos];
            int new_pos_2 = pos - arr[pos]; 
            boolean new_pos1 = helper(arr,new_pos_1);
            boolean new_pos2 = helper(arr,new_pos_2);
    
            return new_pos2 || new_pos1;
        }
        
        return false;
        
    }
}