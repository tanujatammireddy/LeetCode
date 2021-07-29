class Solution {
    
    public boolean isValidSudoku(char[][] board) {
        
      int rows = 9, cols = 9;
      Boolean[] memo_row = new Boolean[9]; 
      Boolean[] memo_col = new Boolean[9]; 
      Boolean[] memo_grid = new Boolean[9];
        
        for(int i=0;i< 9;i++){
           for(int j=0;j< 9;j++){
            if(!is_gridValid(board,memo_grid,i,j) || !is_rowValid(board,i,memo_row,cols) || !is_colValid(board,j,memo_col,rows))
             return false;
        }
        }
        return true;
    }
    
    public Boolean is_gridValid(char[][] board, Boolean[] memo_grid,int row,int col){
        int grid_ID =0, min_row=0, max_row=0, min_col=0, max_col=0;
        
        if(0<=row && row <=2 && 0<= col && col <=2)      {grid_ID =0; min_row=0; max_row=2; min_col=0; max_col=2;}
        else if(0<=row && row <=2 && 3<= col && col <=5) {grid_ID =1; min_row=0; max_row=2; min_col=3; max_col=5;}
        else if(0<=row && row <=2 && 6<= col && col <=8) {grid_ID =2; min_row=0; max_row=2; min_col=6; max_col=8;}
        else if(3<=row && row <=5 && 0<= col && col <=2) {grid_ID =3; min_row=3; max_row=5; min_col=0; max_col=2;}
        else if(3<=row && row <=5 && 3<= col && col <=5) {grid_ID =4; min_row=3; max_row=5; min_col=3; max_col=5;}
        else if(3<=row && row <=5 && 6<= col && col <=8) {grid_ID =5; min_row=3; max_row=5; min_col=6; max_col=8;}
        else if(6<=row && row <=8 && 0<= col && col <=2) {grid_ID =6; min_row=6; max_row=8; min_col=0; max_col=2;}
        else if(6<=row && row <=8 && 3<= col && col <=5) {grid_ID =7; min_row=6; max_row=8; min_col=3; max_col=5;}
        else if(6<=row && row <=8 && 6<= col && col <=8) {grid_ID =8; min_row=6; max_row=8; min_col=6; max_col=8;}
        
        if(memo_grid[grid_ID] == null)
        {    
           memo_grid[grid_ID] = Boolean.TRUE.equals(true);
           Set<Character> set = new HashSet();
           for(int i = min_row; i <= max_row; i++){
            for(int j = min_col; j <= max_col; j++){
                
                if(set.contains(board[i][j])){
                     memo_grid[grid_ID] = Boolean.TRUE.equals(false);
                }
                else{
                     
                    if(board[i][j]!='.') set.add(board[i][j]);
                }
            }
           }
             
        }
        return memo_grid[grid_ID];
    }
    public Boolean is_rowValid(char[][] board,int rowNo, Boolean[] memo_row,int cols){
        
        if(memo_row[rowNo] == null)
        {   
            memo_row[rowNo] = Boolean.TRUE.equals(true);
            Set<Character> set = new HashSet();
            for(int i=0;i<cols;i++){
                if(set.contains(board[rowNo][i])){
                     memo_row[rowNo] = Boolean.TRUE.equals(false);
                     return memo_row[rowNo];
                }
                else{
                    if(board[rowNo][i]!='.')
                    set.add(board[rowNo][i]);
                }
            }
             
        }
        return memo_row[rowNo];
    }
    public boolean is_colValid(char[][] board,int colNo, Boolean[] memo_col,int rows){
         
        if(memo_col[colNo] == null) 
        {   
            memo_col[colNo] = Boolean.TRUE.equals(true);
            Set<Character> set = new HashSet();
            for(int i=0;i<rows;i++){
                if(set.contains(board[i][colNo])){
                    memo_col[colNo] = Boolean.TRUE.equals(false);
                    return memo_col[colNo];
                }
                else{
                     if(board[i][colNo]!='.')
                    set.add(board[i][colNo]);
                }
            }
            
        }
        return memo_col[colNo];
    }
}