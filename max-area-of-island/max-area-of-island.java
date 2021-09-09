class Solution {
    public int maxArea = 0;
    public int maxAreaOfIsland(int[][] grid) {
        int area = 0;
        for(int i=0; i< grid.length;i++){
            for(int j=0; j< grid[0].length;j++){
            area = 0;
            if(grid[i][j]== 1){
                area = areaOfIsland(grid,i,j,1);
                maxArea = (area > maxArea)? area :maxArea;
            }
        }
        }
        return maxArea;
    }
    public int areaOfIsland(int[][] grid, int x, int y, int area){
        //System.out.println("area"+area);
        grid[x][y] = 0;
        int[][] directions ={{0,1},{1,0},{0,-1},{-1,0}};
        
        for(int[] dir: directions){
            
            int X = x+ dir[0];
            int Y = y+ dir[1];
            if(X >= 0 && X < grid.length && Y >= 0 && Y < grid[0].length && grid[X][Y] == 1)
                area = areaOfIsland(grid,X,Y,area+1);
            
        }
        return area;
    }
}