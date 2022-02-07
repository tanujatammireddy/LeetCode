class Solution {
    public int getFood(char[][] grid) {
        
        Queue<int[]> queue = new LinkedList();
        
        int[][] directions= {{0,1},{0,-1},{1,0},{-1,0}};
        int row = grid.length;
        int col = grid[0].length;
        
        boolean[][] visited = new boolean[row][col];
        
        for(int i=0;i< row;i++){
            for(int j=0;j<col; j++){
                if(grid[i][j]=='*'){
                    visited[i][j] = true;
                    queue.add(new int[]{i,j});
                    break;
                }
            }
        }
        
        int level = 0;
        while(!queue.isEmpty()){
            
            int size = queue.size();
            
            for(int i=0;i<size;i++){
                
                int[] current = queue.poll();
                
                for(int[] dir: directions){
                    
                    int X = current[0]+ dir[0];
                    int Y = current[1]+ dir[1];
                    
                    if(X>=0 && X< row && Y>=0 && Y< col && grid[X][Y] != 'X'&& !visited[X][Y]){
                        
                        if(grid[X][Y]=='#')
                            return level+1;
                        queue.add(new int[]{X,Y});
                        visited[X][Y] = true;
                    }
                }
                
                
            }
            level++;
        }
        
        return -1;
        
    }
}