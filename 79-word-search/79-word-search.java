class Solution {
    
    private int row ;
    private int col ;
    public boolean exist(char[][] board, String word) {
        
        row = board.length;
        col = board[0].length;
        for(int i=0 ;i< row ;i++ ){
           for(int j=0 ;j< col;j++ ){
               
               if(board[i][j] == word.charAt(0)){
                   
                   boolean[][] visited = new boolean[row][col];
                   if(helper(board, word,visited,i, j, 0))
                       return true;
                   
               }
            
        } 
        }
            
            
        return false;
        
    }
    
    public boolean helper(char[][] board, String word,boolean[][] visited, int x, int y, int pos){
        
        boolean found = false;
        
        if(pos == word.length())
            found = true;
        else if(x>= 0 && x< row && y>= 0 && y< col && !visited[x][y] && board[x][y] == word.charAt(pos)){
            
            visited[x][y] = true;
            found = helper(board, word,visited,x+1, y, pos+1) ||helper(board, word,visited,x, y+1, pos+1)|| helper(board, word,visited,x, y-1, pos+1)|| helper(board, word,visited,x-1, y, pos+1);
            visited[x][y] = false;
            
        }
        
        return found;
        
        
        
    }
}