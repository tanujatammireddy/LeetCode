class Solution {
    public int shortestDistance(int[][] grid) {
        
        int shortestDistance = Integer.MAX_VALUE;
        int row = grid.length;
        int col = grid[0].length;
        int[][][] distance = new int[row][col][2];
        int buildings = 0;
        for(int i = 0; i< row; i++){
            for(int j=0; j< col ;j++){
                if(grid[i][j] == 1){
                    buildings++;
                    bfs(grid,i,j,distance);
                }
            }
        }
        
        for(int i = 0; i< row; i++){
            for(int j=0; j< col ;j++){

                if(distance[i][j][0] == buildings)
                    shortestDistance = Math.min(shortestDistance,distance[i][j][1]);
            }
        }
        
        return shortestDistance == Integer.MAX_VALUE ? -1 : shortestDistance ;
        
    }
    
    private void bfs(int[][] grid, int x, int y,int[][][] distance){
        
        int row = grid.length;
        int col = grid[0].length;
        boolean[][] visisted = new boolean[row][col];
        int directions[][] = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        
        Queue<int[]> queue = new LinkedList();
        queue.offer(new int[]{x,y});
        visisted[x][y] = true;
        
        int steps = 0;
        
        while(!queue.isEmpty()){
            
            for (int i = queue.size(); i > 0; --i) {
                
            int[] current = queue.poll();
                
            int X = current[0];
            int Y = current[1];
                
            if(grid[X][Y] == 0){
                
                distance[X][Y][0] += 1;
                distance[X][Y][1] += steps;  
            }
                
            for(int[] dir:directions){
                
                int new_x = X + dir[0];
                int new_y = Y + dir[1];
                
                if(new_x >= 0 && new_x < row && new_y >=0 && new_y < col){
                    if(visisted[new_x][new_y] == false && grid[new_x][new_y] == 0){
        
                        visisted[new_x][new_y] = true;
                        queue.offer(new int[]{new_x,new_y});
                    
                    }
                }
                }
           }
             steps++;
        }
       
    }
}