class TicTacToe {

    char[][] board ;
    int N;
    /** Initialize your data structure here. */
    public TicTacToe(int n) {
        board = new char[n][n];
        N = n;
    }
    
    /** Player {player} makes a move at ({row}, {col}).
        @param row The row of the board.
        @param col The column of the board.
        @param player The player, can be either 1 or 2.
        @return The current winning condition, can be either:
                0: No one wins.
                1: Player 1 wins.
                2: Player 2 wins. */
    // Player 1 - 'X'
    // Player 2 - 'O'
    public int move(int row, int col, int player) {
        
        boolean is_row = true;
        boolean is_col = true;
        
        char player_value ;
        player_value = (player == 1 ) ? 'X':'O';
        
        board[row][col] = player_value;
        
       
        // check row
            for(int i= 0; i< N;i++){
                if( board[i][col] != player_value){
                    is_row = false;
                    break;
                }
            }
        
        // check col
        if(is_row == false){
            for(int i= 0; i< N;i++){
                if( board[row][i] != player_value){
                    is_col = false;
                    break;
                }
            }
        }
        // 
       if( (row+col == N-1 ||row == col)  && is_col == false &&  is_row == false){
           boolean diagonal = true; 
           if(row == col){
           for(int i=0;i< N;i++){
               if( board[i][i] != player_value){
                   diagonal = false;
                   break;
                }
            }
               if(diagonal)
               return (player_value== 'X')? 1:2;
           }
           diagonal = true; 
           if(row+col == N-1){
               int j = N-1;
               for(int i= 0;i<N;i++){
                  if( board[i][j-i] != player_value){
                   diagonal = false;
                   break;
                }
                   
               }
               if(diagonal)
               return (player_value== 'X')? 1:2;
           }
           
       }
        
        if(is_row || is_col )
            return (player_value== 'X')? 1:2;
       
        return 0;
    }
}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */