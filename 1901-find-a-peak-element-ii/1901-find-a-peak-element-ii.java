class Solution {
    public int[] findPeakGrid(int[][] grid) {
        
        Queue<Pair<Integer,Integer>> queue = new LinkedList();
        queue.add(new Pair(0,0));
        
        int row = grid.length;
        int col = grid[0].length;
        
        int[][] neighbors = {{0,1},{1,0},{0,-1},{-1,0}};
        
        while(!queue.isEmpty()){
            
            Pair current = queue.poll();
            int X = (int)current.getKey();
            int Y = (int)current.getValue();
            
            int value = grid[X][Y];
            
            int neigh_count = 0;
            int greater_count = 0;
            
            int next_x = -1;
            int next_y = -1;
            
            for(int[] neigh:neighbors){
                
                int x = neigh[0] +X ;
                int y = neigh[1] +Y ;
                
                if(x>=0 && x< row && y>=0 && y< col){
                    neigh_count ++;
                    int neigh_value = grid[x][y];
                    if(neigh_value > value)
                    {
                        next_x = x;
                        next_y = y;
                    }
                    else
                        greater_count++;
                        
                }
                
            }
            
            if(neigh_count == greater_count)
                return new int[]{X,Y}; 
            if(next_x != -1)
                queue.add(new Pair(next_x,next_y));
                
        }
        
        
        
        return new int[]{-1,-1};
        
    }
}