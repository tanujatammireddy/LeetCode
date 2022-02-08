class Solution {
    int len;
    boolean [] visited;
    public boolean canReach(int[] arr, int start) {
        
        len = arr.length;
        visited = new boolean[len];
        return helper(arr,start);
    }
    
    public boolean helper(int[] arr, int pos){
        
        if(pos >= 0 && pos < len && !(visited[pos])){
            
            if(arr[pos] == 0)
                return true;
            visited[pos] = true;
            
            boolean new_pos1 = false;
            int new_pos_1 = pos+arr[pos];
            boolean new_pos2 = false;
            int new_pos_2 = pos-arr[pos];
            
            if(new_pos_1 >= 0 &&  new_pos_1 < len && !(visited[new_pos_1])){
                new_pos1 = helper(arr,new_pos_1);
            }
            
            if(new_pos_2 >= 0 &&  new_pos_2 < len && !(visited[new_pos_2])){
                new_pos2 = helper(arr,new_pos_2);
            }
            
            return new_pos2 || new_pos1;
            
        }
        
        return false;
        
    }
}