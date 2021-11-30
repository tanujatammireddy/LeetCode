class Solution {
    int row;
    int col;
    public void setZeroes(int[][] matrix) {
        row = matrix.length;
        col = matrix[0].length;
        
        Set<Integer> row_Set = new HashSet();
        Set<Integer> col_Set = new HashSet();
        for(int i=0 ; i< row ;i++){
            for(int j=0; j< col ;j++){
                if(matrix[i][j] == 0){
                    row_Set.add(i);
                    col_Set.add(j);
                }
            }
        }
        
        if(row_Set.size() > 0){
            matrix = set_row(matrix,row_Set);
            matrix = set_col(matrix,col_Set);
        }
        
       // return matrix;
    }
    
    
    public int[][] set_row(int[][] matrix, Set<Integer> row_Set ){
        
        for(int current:row_Set){
            for(int j=0; j< col ;j++){
                matrix[current][j] = 0;
            }
        }
        
        return matrix;
    }
    
    public int[][] set_col(int[][] matrix, Set<Integer> col_Set ){
        
        for(int i=0; i< row; i++){
            for(int current:col_Set){
                matrix[i][current] = 0;
            }
        }
        
        return matrix;
    }
}