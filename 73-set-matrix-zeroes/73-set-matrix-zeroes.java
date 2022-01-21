class Solution {
    public void setZeroes(int[][] matrix) {
        
        int row = matrix.length;
        int col = matrix[0].length;
        
        boolean[] row_set = new boolean[row];
        boolean[] col_set = new boolean[col];
        
        for(int i=0;i< row ;i++){
            for(int j=0;j<col ;j++){
                if(matrix[i][j] == 0)
                {
                    row_set[i] = true;
                    col_set[j] = true;
                }
                
            }
        }
        for(int i=0;i< row ;i++){
            for(int j=0;j<col ;j++){
                if(row_set[i] ||col_set[j])
                    matrix[i][j] = 0;
            }
        }
        
    }
}