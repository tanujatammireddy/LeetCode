class Solution {
    public int closedIsland(int[][] grid) {
        if (grid == null || grid.length == 0)
            return 0;
        
        int count = 0;
        for (int i = 1; i < grid.length-1; i++){
            for (int j = 1; j < grid[0].length -1; j++){
                if (grid[i][j] == 0){
                    if(dfs(grid, i , j)){
                        count++;
                    }  
                }
            }
        }
        return count;
    }
    
    private boolean dfs(int[][] grid, int i , int j){    
        if (grid[i][j] == 2 || grid[i][j] == 1){
            return true;
        }
        if (onPerimeter(grid, i, j)){
            return false;
        }
        
        grid[i][j] = 2;
        
        boolean up = dfs(grid, i-1, j);
        boolean down = dfs(grid, i+1, j);
        boolean left = dfs(grid, i, j-1);
        boolean right = dfs(grid, i, j+1);
        
        return left && right && up && down;   
    }
    
    private boolean onPerimeter(int[][] grid, int i , int j){
       if (i == 0 || i == grid.length-1 || j == 0 || j == grid[0].length -1){
           return true;
       }
        return false;
    }
}