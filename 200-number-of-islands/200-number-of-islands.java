class Solution {
    
   
    public int numIslands(char[][] grid) {
        
        int count = 0;
        for(int i= 0; i<grid.length; i++){
          for(int j= 0; j<grid[0].length; j++){
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
        if(x>=0 && x< grid.length && y>=0 && y< grid[0].length && grid[x][y] =='1')
        {
            grid[x][y] ='0';
            helper(grid,x+1,y);
            helper(grid,x-1,y);
            helper(grid,x,y-1);
            helper(grid,x,y+1);
        }
    }
}