class Solution {
    int row;
    int col;
    public void solve(char[][] board) {
        if(board == null || board.length == 0) return;
        row = board.length;
        col = board[0].length;
        
        Set<Integer> col_set = new HashSet();
        col_set.add(0);
        col_set.add(col-1);
        
        Set<Integer> row_set = new HashSet();
        row_set.add(0);
        row_set.add(row-1);
        
        // Marking borders from 'O'
        Set<int[]> borders_set = new HashSet();
        for(int i=0; i< row;i++){
            borders_set.add(new int[]{i,0});
            borders_set.add(new int[]{i,col-1});
        }
       for(int i= 0; i< col;i++){
            borders_set.add(new int[]{0,i});
            borders_set.add(new int[]{row-1,i}); 
        }
        for(int[] p:borders_set){
            if(board[p[0]][p[1]] == 'O')
                dfs(board,p[0],p[1]);  
                
        }
        
        for(int i=0;i< row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j] == 'O')
                    board[i][j] = 'X';
                else if(board[i][j] == 'C')
                    board[i][j] = 'O';
            }
        }
    }
    
    public void dfs(char[][] board, int X, int Y){
        
        if(X >= 0 && X < row && Y >= 0 && Y < col && board[X][Y] == 'O'){
            board[X][Y] ='C';
          dfs(board,X+1,Y);  
          dfs(board,X-1,Y);  
          dfs(board,X,Y+1);
          dfs(board,X,Y-1);
        }
    }
}