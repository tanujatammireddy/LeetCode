class Solution {
    
    List<List<String>> result;
    int N;
    public List<List<String>> solveNQueens(int n) {
        
        N  = n; 
        result = new ArrayList();
        char[][] mat = new char[n][n];
        for(int i=0; i < n;i++){
            for(int j=0; j < n;j++){
                mat[i][j] ='.';
            }
        }
        helper(0, new HashSet<>(), new HashSet<>(), new HashSet<>(), mat);
        return result;
    }
    
    public void helper(int row, Set<Integer> diagonals, Set<Integer> antiDiagonals, Set<Integer> cols, char[][] grid){
        
        //System.out.println(row);
        if(row == N){
            result.add(stringRepresentation(grid));
            return;
        }
        else{
            
            for(int col=0; col< N; col++){
                
                int currDiagonal = row-col;
                int currAntiDiagonal = row+col;
                
                if(cols.contains(col)||diagonals.contains(currDiagonal) || antiDiagonals.contains(currAntiDiagonal)){
                   continue; 
                }
                
                cols.add(col);
                diagonals.add(currDiagonal);
                antiDiagonals.add(currAntiDiagonal);
                
                grid[row][col] = 'Q';
                
                //System.out.println("row :"+row);
                helper(row+1,diagonals,antiDiagonals,cols,grid);
                
                cols.remove(col);
                diagonals.remove(currDiagonal);
                antiDiagonals.remove(currAntiDiagonal);
                grid[row][col] = '.';
            }
            
        }
    }
    
    public List<String> stringRepresentation (char[][] grid){
        
        List<String> board = new ArrayList();
        
        for(int i=0;i<N;i++){
           board.add(new String(grid[i]));
        }
        
        return board;
    }
}