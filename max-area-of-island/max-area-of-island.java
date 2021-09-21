class Solution {
    int row =0, col=0;
    int maxArea = 0;
    public int maxAreaOfIsland(int[][] grid) {
        row = grid.length;
        col = grid[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]== 1)
                    maxArea = Math.max(dfs(grid,i,j,0),maxArea);
            }
        }
        return maxArea;
        
    }
    
    public int dfs(int[][] grid, int x, int y, int area){
        if(x>=0 && y>=0 && x<row && y<col && grid[x][y] == 1)
        {   grid[x][y] = 0;
            area++;
            area= dfs(grid,x+1,y,area);
            area= dfs(grid,x,y+1,area);
            area= dfs(grid,x,y-1,area);
            area= dfs(grid,x-1,y,area);
        }
        
        return area;
    }
}