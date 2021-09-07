class Solution {
    public void rotate(int[][] matrix) {
        
        int n = matrix.length;
        int row = n-1, col = n-1;
        for(int i=0; i<(n+1)/2 ; i++){
            for(int j= 0;j<n/2;j++){
                
              //  System.out.println("i: "+i+" j:"+j +" matrix[row - i][j]"+ matrix[row - i][j] +" matrix[row-i][col-j]"+ matrix[row-i][col-j] +" matrix[i][col-j]"+ matrix[i][col-j] + " matrix[i][j]" + matrix[i][j] );
                
                int temp = matrix[col - j][i];
                
                matrix[col - j][i] = matrix[row-i][col-j];
                matrix[row-i][col-j] = matrix[j][row-i];
                matrix[j][col-i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
        
        
    }
}