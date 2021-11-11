class Solution {
    int row ;
    int col ;
    public boolean exist(char[][] board, String word) {
        row = board.length;
        col = board[0].length;
        boolean[][] visited = new boolean[row][col];
        for(int i=0;i< row;i++){
            for(int j=0;j<col;j++){
               if(board[i][j] == word.charAt(0))
               {
                   if(helper(board,visited,i,j,0,word))
                       return true;
               }
            }
        }
        
        return false;
        
    }
    
    public boolean helper(char[][] board,boolean[][] visited, int x, int y, int pos,String word){
        
        if(pos == word.length())
            return true;
        boolean found = false;
        //System.out.println(word.charAt(pos));
        if(x>=0 && x< row && y>= 0 && y<col && !visited[x][y] && board[x][y]== word.charAt(pos)){
            visited[x][y] = true;
            found = (helper(board,visited,x,y+1,pos+1,word)||helper(board,visited,x,y-1,pos+1,word)||helper(board,visited,x+1,y,pos+1,word)|| helper(board,visited,x-1,y,pos+1,word));
            visited[x][y] = false;
        }
        return found;
    }
}