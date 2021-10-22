class Solution {
    public String strWithout3a3b(int a, int b) {
        
        int max_length = a + b;
        StringBuilder sb = new StringBuilder();
        if(max_length > 0){
            int a_count = 0;
            int b_count = 0;
            while(sb.length() < max_length){
                
                if(a >= b){
                    
                if(a_count < 2){
                    sb.append('a');
                    a--;
                    a_count++;
                    b_count = 0;
                    }
                else{
                    sb.append('b');
                    b--;
                    b_count++;
                    a_count = 0; 
                    }
                }
                else {
                    if(b_count < 2){
                        sb.append('b');
                        b--;
                        b_count++;
                        a_count = 0;
                    }
                    else{
                    sb.append('a');
                    a--;
                    a_count++;
                    b_count = 0;
                    }
                }
            }
        }
        return sb.toString();
    }
}