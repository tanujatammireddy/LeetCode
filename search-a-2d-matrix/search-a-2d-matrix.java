class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row1  = 0;
        int row2  = matrix.length-1;
        int col1  = 0;
        int col2  = matrix[0].length-1;
        
        
        while(row1 <= row2){
            
            int mid_row  = row1 + (row2-row1)/2 ;
            
            if(matrix[mid_row][0] == target )
                return true;
            else if(matrix[mid_row][0] > target)
                row2 = mid_row-1 ;
            else
                row1 = mid_row+1 ;
            
        }
        
        if(row1 > 0)
            row1--;
        while(col1 <= col2){
            
            int mid_col  = col1 + (col2-col1)/2 ;
            //System.out.println("matrix[mid_row][0]: "+matrix[mid_row][0]);
            
            if(matrix[row1][mid_col] == target )
                return true;
            else if(matrix[row1][mid_col] > target)
                col2 = mid_col-1 ;
            else
                col1 = mid_col+1 ;
            
        }
        
        
        
        
        return false;
        
        
    }
}