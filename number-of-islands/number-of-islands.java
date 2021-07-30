class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;
        int n=0,m=0;
        int count=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(grid[i][j]=='1'){
                   island(grid,i,j,rows,columns);  
                    count++;
                }
            }
        }
        
        return count;
    }
     public void island(char[][]grid, int i,int j,int rows,int columns){
         
         if(grid[i][j]=='1'){
             grid[i][j]='0';
             int[][] directions = new int[][]{{1,0},{0,1},{-1,0},{0,-1}}; 
             for(int[] dir:directions){
                 int x= i+dir[0];
                 int y =j+ dir[1];
                 if(x>=0 && x<rows && y>=0 && y<columns)
                   island(grid,x,y,rows,columns);  
             }
         }
     }
}