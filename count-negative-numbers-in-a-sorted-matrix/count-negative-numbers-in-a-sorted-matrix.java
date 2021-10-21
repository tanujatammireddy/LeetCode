class Solution {
    public int countNegatives(int[][] grid) {
        int row = grid.length-1;
        int col_count = grid[0].length;
        int count = 0;
        while(row >= 0 ){
            int col =0;
            while(col < col_count && grid[row][col] > -1){
                col++;
            }
            //System.out.println("col:"+col);
            if(col != col_count)
            count += col_count-col;
            
            row --;
        }
        return count;
    }
}