class Solution {
    public int row;
    public int col;
    public int maxAreaOfIsland(int[][] grid) {
        int area = 0;
        row = grid.length;
        col = grid[0].length;
        for(int i=0;i< row;i++){
            for(int j=0;j< col;j++){
                if(grid[i][j] == 1){
                    area = Math.max(dfs(grid,0,i,j),area);
                }
            }
        }
        
        return area;
    }
    public int dfs(int[][] grid, int area, int x, int y){
        if(x >=0 && x< row && y>=0 && y< col && grid[x][y]==1){
            area++;
            grid[x][y] = 0;
            area = dfs(grid,area,x,y+1);
            area = dfs(grid,area,x+1,y);
            area = dfs(grid,area,x-1,y);
            area = dfs(grid,area,x,y-1);
        }
        return area;
    }
}