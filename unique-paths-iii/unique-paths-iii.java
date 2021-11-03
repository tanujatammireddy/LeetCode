class Solution {
    int[][] directions;
    boolean [][] visited;
    int row;
    int col;
    int uniquePathsCount = 0;
    int emptySquares = 0;
    public int uniquePathsIII(int[][] grid) {
        
    directions = new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
    row = grid.length;
    col = grid[0].length;
    visited = new boolean [row][col]; 
    int start_x = -1;
    int start_y = -1;
        
        for(int i=0; i< row;i++){
            for(int j=0 ; j<col; j++){
                if(grid[i][j] == 1)
                {
                    start_x = i;
                    start_y = j;
                }  
                if(grid[i][j] == 0)
                    emptySquares ++;
            }
        }
        
       backTracking(grid,start_x,start_y);
       return  uniquePathsCount;
    }
    
    public void backTracking(int[][] grid, int x, int y){
        
        if(x >=0 && x< row && y>=0 && y< col && !visited[x][y] ){
            
            if(grid[x][y] == -1)
                return;
            if(grid[x][y] == 2){
                if(emptySquares == 0)
                    uniquePathsCount++;
                return;
            }
            visited[x][y] = true;
            
            if(grid[x][y] == 0)
            emptySquares--;
            
            //System.out.println("x: "+x+" y: "+y+" emptySquares:"+emptySquares);
            for(int[] direction : directions){
                int X = x + direction[0];
                int Y = y + direction[1];
                backTracking(grid,X,Y);
            }
            visited[x][y] = false;
            emptySquares++;
        }
        
        
        
    }
}