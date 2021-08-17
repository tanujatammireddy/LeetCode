class Solution {
    public void rotate(int[][] matrix) {
        
        int n = matrix.length;

        int col = n-1;
        
        for(int i = 0 ; i < (n+1)/2; i++){
            
        for(int j = 0 ; j < n/2; j++){
            
           // System.out.println(" matrix[i][j]"+ matrix[i][j]);
            
            int temp = matrix[col-j][i];

            matrix[col-j][i] = matrix[col-i][col-j];
            matrix[col-i][col-j] = matrix[j][col-i];
            matrix[j][col-i] = matrix[i][j];
            matrix[i][j] = temp;
            //System.out.println("");
            
            }              
           /* for(int k = 0 ; k< n; k++){
            for(int l = 0 ; l< n; l++){
            System.out.print(" "+matrix[k][l]);}
            System.out.println("");
            }*/
    }
        
        
    }
}