class Solution {
    public int largestSubmatrix(int[][] matrix) {
        
        int col = matrix[0].length;
        int[] col_count = new int[col];
        int area = 0;
        for(int i=1;i< matrix.length ;i++){
            for(int j=0;j< matrix[0].length ;j++){
               if(matrix[i][j] == 1) matrix[i][j]=matrix[i-1][j]+1;
             } 
            }
    
        for (int i = 0; i <matrix.length ; i++) {
        int[] row = matrix[i];
        Arrays.sort(row);
        area = Math.max(area,compute(row));

        }
        return area;
    }
    public int compute(int[] row){
        
    int col_2=row.length-1;
    int area=0;
    int col=col_2;
        while (col >= 0){
            area = Math.max( area,(Math.min(row[col],row[col_2])*(col_2 - col+1))) ;
            col--;
        }
            return area; 
    }
}