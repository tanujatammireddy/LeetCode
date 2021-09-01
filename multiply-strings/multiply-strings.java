import java.lang.Math;
class Solution {
    public String multiply(String num1, String num2) {
        int l1 = num1.length();
        int l2 = num2.length();
        
        
        int[][] result = new int[l2][l1+l2+1];
        int carry = 0;
        int result_row = 0, result_column = l1+l2, column = l1+l2;
        int k = 0;
        
        for(int i = l2-1; i >= 0 ;i--){
            result_column = column - k;
            
            for(int j = l1-1; j >=0 ;j--){
                
                int current  = (Character.getNumericValue(num1.charAt(j))  * Character.getNumericValue(num2.charAt(i))) +result[result_row][result_column] ;
                
                if(current > 9){
                    result[result_row][result_column] = current% 10;
                    result[result_row][result_column-1] = current/10;
                }
                else
                   result[result_row][result_column] = current;
                
                result_column--;
            }
            k++;
            result_row++;
        }
        
        //System.out.println(""+result_column);
        //result[l2-1][result_column] = carry ;
        
        int col_Sum = 0, col_Carry = 0;
        StringBuilder sb = new StringBuilder();
        
        System.out.println(Arrays.deepToString(result));
        
        for(int j= column ; j>=0; j--){
            col_Sum = 0;
        for(int i=0; i<l2; i++)
            col_Sum = col_Sum + result[i][j];
         
           col_Sum += col_Carry;
            if(col_Sum > 9){
                col_Carry = col_Sum/10;
                col_Sum = col_Sum % 10;
            }
            else
                col_Carry =0;
            sb.insert(0, Integer.toString(col_Sum));
        } 
        
        int length = sb.length();
        int index = 0;
        StringBuilder finalString = new StringBuilder();
        
        while(index< length && sb.charAt(index) == '0'){
            index++;
        }
        if(index == length ) return "0";
        while(index< length){
        finalString.append(sb.charAt(index));
        index++;
        }
        
        return finalString.toString();
    }
}