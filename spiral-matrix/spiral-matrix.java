class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> spiralOrder = new ArrayList();
        
        int row1 = 0; 
        int row2 = matrix.length-1;
        
        int col1 = matrix[0].length-1;
        int col2 = 0;
        
        while(row1 <= row2 && col1 >= col2){
            
            for(int i= col2; i<= col1; i++){
                System.out.println( "*******" +matrix[row1][i]);
                spiralOrder.add(matrix[row1][i]);
            }
            
            for(int i= row1 + 1; i<= row2;i++){
                System.out.println("**//**"+matrix[i][col1]);
                spiralOrder.add(matrix[i][col1]);
            }
            
            
            if(row1 < row2 && col2 < col1){
            for(int i= col1-1 ; i > col2; i--){
                System.out.println("***!!****"+matrix[row2][i]);
                spiralOrder.add(matrix[row2][i]);
            }
            for(int i= row2 ; i > row1; i--){
                System.out.println("****##***"+matrix[i][col2]);
                spiralOrder.add(matrix[i][col2]);
            }
            
            }
            row1++;
            col1--;
            row2--;
            col2++;
        }
        
        return spiralOrder;
        
    }
}