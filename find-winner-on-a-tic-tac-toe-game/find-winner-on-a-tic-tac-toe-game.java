class Solution {
    
    public char [][] board;
    public String tictactoe(int[][] moves) {
        int count = 1;
        char player ;
        board = new char [3][3];
        int total = 9;
        for(int[] move: moves){
            
           if(count%2 == 1)
               player = 'A';
            else
                player = 'B';
            
            int row = move[0];
            int col = move[1];
            board[row][col] = player;
            if(count >= 5){
            if(check_row(board, row,  col, player))
                return String.valueOf(player);
            if(check_col(board, row, col, player))
                return String.valueOf(player);
            if(row == col)
                if(check_diagonal_1(board,row, col, player))
                    return String.valueOf(player);
            if(row + col == 2)
                if(check_diagonal_2(board,row, col, player))
                    return String.valueOf(player);
            }
            count++;
            total --;
            
        }
        
        if(total == 0) 
            return "Draw";
        else
            return "Pending";
    }
    
    public boolean check_row(char[][] board,int row, int col,char player){
        for(int i=0;i<3 ;i++){
            if(board[row][i] != player)
                return false;
        }
        return true;
    }
     public boolean check_col(char[][] board,int row, int col,char player){
         
         for(int i=0;i<3 ;i++){
            if(board[i][col] != player)
                return false;
        }
        return true;
    }
     public boolean check_diagonal_1(char[][] board,int row, int col,char player){
         for(int i=0;i<3 ;i++){
            if(board[i][i] != player)
                return false;
        }
        return true;
    }
     public boolean check_diagonal_2(char[][] board,int row, int col,char player){
         int j = 2;
         for(int i=0;i<3 ;i++){
             
            if(board[i][j-i] != player)
                return false;
        }
        return true;
    }
}