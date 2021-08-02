class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> returnList = new ArrayList();
        
        if(matrix.length==0) return returnList;
        
        int row1 = 0, row2 = matrix.length-1;
        int col1 = 0, col2 = matrix[0].length-1;
        
        while(row1 <= row2 && col1 <= col2){
            
             for (int c = col1;   c <= col2; c++) returnList.add(matrix[row1][c]);
             for (int r = row1+1; r <= row2; r++) returnList.add(matrix[r][col2]);
            
            if(row1 < row2 && col1 < col2){
                for (int c = col2-1; c > col1; c--) returnList.add(matrix[row2][c]);
                for (int r = row2; r > row1; r--)   returnList.add(matrix[r][col1]);
            }
            row1++;
            row2--;
            col1++;
            col2--;
        }
        return returnList;
    }
}