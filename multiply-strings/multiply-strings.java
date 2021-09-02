import java.lang.Math;
class Solution {
    public String multiply(String num1, String num2) {
        int l1 = num1.length();
        int l2 = num2.length();
        
        int[] result = new int [l1+l2];
        int result_column = l1+l2-1, column = l1+l2-1;
        int k = 0;
        
        for(int i = l2-1; i >= 0 ;i--){
            result_column = column - k;
            for(int j = l1-1; j >=0 ;j--){
                
            int current  = (Character.getNumericValue(num1.charAt(j))  * Character.getNumericValue(num2.charAt(i)))+ result[result_column] ;
            result[result_column] = current% 10;
            result[result_column-1] += current/10;
            result_column--;
                
            }
            k++;
        }
        
        //System.out.println(Arrays.toString(result));
        
        StringBuilder sb = new StringBuilder();
        int pointer =0;
        while(pointer<=column && result[pointer] == 0)
                pointer++;

        if(pointer == column+1) return "0";
        
        while(pointer<= column){
            sb.append(result[pointer]);
            pointer++;
        }
        
        return sb.toString();
    }
}