class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length-1;
        int cols = grid[0].length-1;
        int count=0;
         
        for(int i=0;i<=rows;i++){
            for(int j=0;j<=cols;j++){
                if(grid[i][j] == '1'){
                    count++;
                    checkIsland(grid,rows,cols,i,j);
                }
            }
        }
        return count;
     }
    public void checkIsland(char[][] grid,int rows,int cols,int i,int j){
        int[][] directions={{1,0},{-1,0},{0,-1},{0,1}};
        for(int[] dir:directions){
            int row = i + dir[0];
            int col = j + dir[1];
            if(row>=0 && row<= rows && col>=0 && col<= cols && grid[row][col]=='1'){
                grid[row][col]='0';
                checkIsland(grid,rows,cols,row,col);
            }
        }
    }
}