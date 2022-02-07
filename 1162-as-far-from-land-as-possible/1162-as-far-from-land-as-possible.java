class Solution {
    public int maxDistance(int[][] grid) {
        
        int n = grid.length;
        int maxDistance = Integer.MIN_VALUE;
        
        int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};
        boolean visited[][] = new boolean[n][n];
        int landCount = 0;
        
        Queue<int[]> queue = new LinkedList();
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                // Land
                if(grid[i][j] == 1)
                {
                    queue.add(new int[]{i,j});
                    landCount++;
                    visited[i][j] = true; 
                }
                
            }
        }
        if(landCount == n*n || landCount == 0)
            return -1;
        
        // Using BFS to calculate the distance to water, 
        while(!queue.isEmpty()){
            
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int dis = grid[x][y];
            for(int[] dir: directions){
                int X = x + dir[0];
                int Y = y + dir[1];
                
                if(X >=0 && X< n && Y>=0 && Y< n && !visited[X][Y]){
                    grid[X][Y] = dis+1;
                    maxDistance = Math.max(grid[X][Y],maxDistance);
                    visited[X][Y] = true; 
                    queue.add(new int[]{X,Y});
                }
            }
            
        }
        return maxDistance-1;
        
    }
    
    
}