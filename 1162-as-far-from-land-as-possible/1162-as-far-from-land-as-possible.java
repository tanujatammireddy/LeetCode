class Solution {
    public int maxDistance(int[][] grid) {
        
        int water = 0;
        int land = 1;
        
        int n = grid.length;
        int maxDistance = Integer.MIN_VALUE;
        
        int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};
        boolean visited[][] = new boolean[n][n];
        int landCount = 0;
        int waterCount = 0;
        
        Queue<int[]> queue = new LinkedList();
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                
                if(grid[i][j] == land)
                {
                    queue.add(new int[]{i,j});
                    landCount++;
                    visited[i][j] = true; 
                }
                else
                    waterCount++;
                
            }
        }
        if(landCount == n*n || waterCount== n*n )
            return -1;
        
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