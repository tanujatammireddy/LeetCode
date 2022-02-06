class Solution {
    
    int row;
    int col;
    
    public int numIslands(char[][] grid) {
        
        int count = 0;
        row = grid.length;
        col = grid[0].length;
        
        for(int i= 0; i<row; i++){
          for(int j= 0; j<col; j++){
              
              if(grid[i][j] == '1')
              {
                  helper(grid,i,j);
                  count++;
              }
        }  
        }
        
        return count;
    }
    
    public void helper(char[][] grid, int x, int y){
        if(x>=0 && x< row && y>=0 && y< col && grid[x][y] =='1')
        {
            grid[x][y] ='0';
            helper(grid,x+1,y);
            helper(grid,x-1,y);
            helper(grid,x,y-1);
            helper(grid,x,y+1);
        }
    }
}