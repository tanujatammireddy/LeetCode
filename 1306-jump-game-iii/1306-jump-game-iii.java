class Solution {
    
    
    public boolean canReach(int[] arr, int start) {
        
        boolean [] visited = new boolean[arr.length];
        return helper(arr,start,visited);
    }
    
    public boolean helper(int[] arr, int pos,boolean [] visited){
        
        if(pos >= 0 && pos < arr.length && !(visited[pos])){
            
            if(arr[pos] == 0)
                return true;
            visited[pos] = true;
        
            int new_pos_1 = pos + arr[pos];
            int new_pos_2 = pos - arr[pos]; 
            boolean new_pos1 = helper(arr,new_pos_1,visited);
            boolean new_pos2 = helper(arr,new_pos_2,visited);
    
            return new_pos2 || new_pos1;
        }
        
        return false;
        
    }
}