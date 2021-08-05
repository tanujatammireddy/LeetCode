class Solution {
    public int countNegatives(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int current_row = rows-1, current_col = 0;
        int count =0;
        
        while(current_row >=0 && current_col < cols){
            if(grid[current_row][current_col] < 0){
                count +=  cols -current_col;
                current_row--;
                current_col = 0;
            }
            else{
                if(current_col == cols-1){
                    current_row--; 
                    current_col = 0;
                }
                else{
                    current_col++;
                }
            }
        }
        return count;
    }
}