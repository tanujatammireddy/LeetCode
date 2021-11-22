class Solution {
    public String addBinary(String a, String b) {
        
        StringBuilder sb = new StringBuilder();
        
        int i= a.length()-1, j= b.length()-1;
        char carry = '0';
        char char_a = '0';
        char char_b = '0';
        
        while(i >= 0  || j >=0 ){
            
            char_a = i >= 0 ? a.charAt(i) : '0';
            char_b = j >= 0 ? b.charAt(j) : '0';
            
            char sum = '0';
            
            //System.out.println("char_a: "+char_a+" char_b: "+char_b+" carry: "+carry);
            if( (char_a == '0' && char_b == '1') ||(char_a == '1' && char_b == '0')){
                if(carry == '0')
                {
                    sum = '1';
                    carry = '0';
                    
                }
                else
                {
                    sum = '0';
                    carry = '1';
                }
                }
            else if(char_a == '0' && char_b == '0'){
                 if(carry == '0')
                {   
                    carry = '0';
                    sum = '0';
                }
                else
                {
                    sum = '1';
                    carry = '0';
                }
                   
               }
               // char_a = 1, char_b = 1
           else {
                if(carry == '0')
                {
                    sum = '0';
                    carry = '1';
                }
                else
                {
                    sum = '1';
                    carry = '1';
                }
               }
               
            //System.out.println("sum"+sum);
            sb.insert(0,sum);
            i--; j--;
               }
        if(carry == '1')
            sb.insert(0,carry);
        return sb.toString();
        
    }
}