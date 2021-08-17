class Solution {
    
    public int maxAreaOfIsland(int[][] grid) {
    int[][] directions ={{0,1},{1,0},{0,-1},{-1,0}};
    int row = grid.length, col = grid[0].length;
    int maxArea = 0;
        for(int i=0;i<row;i++){
          for(int j=0;j<col;j++){
            
             if(grid[i][j] == 1){
             int area =  calculateArea(grid,directions,1,i,j,row,col) ;
             if(area > maxArea ) maxArea = area;
            }
        }  
        }
        return maxArea;
    }
    
    public int calculateArea(int[][] grid,int[][] directions,int currentArea, int x, int y, int row, int col){
        grid[x][y] = 0;
        for(int[] dir:directions ){
            int X = dir[0] + x;
            int Y = dir[1] + y;
            if(X>=0 && X< row && Y>=0 && Y<col && grid[X][Y]== 1){
               currentArea = calculateArea(grid,directions,currentArea+1,X,Y,row,col) ;
            }
        }
        return currentArea;
    }
}