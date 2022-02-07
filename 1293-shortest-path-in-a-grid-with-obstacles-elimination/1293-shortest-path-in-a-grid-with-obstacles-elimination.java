class Solution {
    public int shortestPath(int[][] grid, int k) {
        
        int row = grid.length;
        int col = grid[0].length;
        boolean[][][] visited = new boolean[row][col][k+1];
        int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};
        int steps = 0;
        Queue<int[]> queue = new LinkedList();
        queue.add(new int[]{0,0,0});
        visited[0][0][0]= true;
        
        while(!queue.isEmpty()){
            
            int size = queue.size();
            
            for(int i=0;i< size;i++){
                
                int[] current = queue.poll();
                int x = current[0];
                int y = current[1];
                int obs = current[2];
                
                if(x == row-1 && y== col-1){
                    return steps;
                }
                
                for(int[] dir:directions){
                    
                    int X = x + dir[0];
                    int Y = y + dir[1];
                    
                    if(X>=0 && X< row && Y>=0 && Y< col){
                        
                        int obs_new = obs + grid[X][Y];
                        if(obs_new > k) continue;
                        if(!visited[X][Y][obs_new]){
                            queue.add(new int[]{X,Y,obs_new});
                            visited[X][Y][obs_new]= true;
                        }
                    }
                }
            } 
            steps++;
        }
        
        return -1;
        
    }
}