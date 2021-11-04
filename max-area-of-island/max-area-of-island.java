class Solution {
    int row;
    int col;
    public int maxAreaOfIsland(int[][] grid) {
    
        int maxArea = 0;
        row = grid.length;
        col = grid[0].length;
        for(int i= 0;i<row;i++){
            for(int j =0;j<col ;j++){
                if(grid[i][j] == 1)
                    maxArea = Math.max(backtracking(grid,i,j,0),maxArea);  
                
           }
       } 
        return maxArea;
    }
    
    public int backtracking(int[][] grid,int x, int y, int area){
        
        if(x >= 0 && x < row && y >= 0 && y< col && grid[x][y] == 1){
            grid[x][y] = 0;
            area++;
            area = backtracking(grid,x+1,y,area);
            area = backtracking(grid,x-1,y,area);
            area = backtracking(grid,x,y+1,area);
            area = backtracking(grid,x,y-1,area);
        }
        return area;
    }
}