class Solution {
    public int shortestPath(int[][] grid, int k) {
        
        int row = grid.length;
        int col = grid[0].length;
        
        if(k== 0) return row+col-2;
        
        boolean[][][] visited = new boolean[row][col][k+1];
        int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};
        Queue<int[]> queue = new LinkedList();
        queue.add(new int[]{0,0,0});
        visited[0][0][0] = true;
        int steps= 0;
        
        
        
        while(!queue.isEmpty()){
            
            int size = queue.size();
            
            for(int i=0;i< size;i++){
                int[] current = queue.poll();
                int x = current[0];
                int y = current[1];
                int obs = current[2];
            
                if(x == row-1 && y == col-1){
                return steps;
                }
                for(int[] dir:directions){
                    
                    int X = x + dir[0];
                    int Y = y + dir[1];
                    int new_obs = obs + grid[x][y];
                    
                    if(X >=0 && X < row && Y >= 0 && Y < col && new_obs <= k && !visited[X][Y][new_obs]){
                        visited[X][Y][new_obs] = true;
                        queue.add(new int[]{X,Y,new_obs});
                    }
                    
                }
            }
           steps++; 
                
        }
        
        return -1;
        
        
    }
}