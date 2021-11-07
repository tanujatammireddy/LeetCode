class Solution {
    public String multiply(String num1, String num2) {
        int len = num1.length() + num2.length() +1;
        int[] result = new int[len];
        
        int idx = len-1;
        int carry = 0;
        int k = 0;
        
        for(int i = num2.length()-1; i>=0 ;i--){ // num1
            
            idx = len-1-k;
            carry = 0;
            
            for(int j = num1.length()-1; j>=0 ;j--){ // num2
                
                int current = (Character.getNumericValue(num1.charAt(j)) * Character.getNumericValue(num2.charAt(i)))+ carry +result[idx];
                
                if(current > 9){
                    carry = current/10;
                    current = current%10;
                }
                else
                    carry = 0;
                
                result[idx] = current;
                idx--;
                
            }
            if(carry > 0)
                result[idx] = carry;
            k++;
                
        }
        return arrayToString(result);
    }
    public String arrayToString(int[] result){
        int i = 0;
        StringBuilder sb = new StringBuilder() ;
        
        while(i< result.length && result[i]== 0){
            i++;
        }
        if(i== result.length)
            return "0";
        while(i< result.length){
            sb.append(((char)result[i])+0);
            i++;
        }              
        
        return sb.toString();
    }
}