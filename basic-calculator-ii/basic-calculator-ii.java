class Solution {
    public int calculate(String s) {
        s.trim();
        int len = s.length() ;
        Stack<Integer> stack = new Stack<Integer>();
        char operator = '$';
        
        for(int i = 0 ;i< len; i++){
            
            if(s.charAt(i) == ' ') continue;
            
            StringBuilder sb = new StringBuilder();
        
            if(Character.isDigit(s.charAt(i))){
            
            while(i < len && Character.isDigit(s.charAt(i))){
                sb.append(s.charAt(i));
                i++;   
            }
            
            int value = Integer.parseInt(sb.toString());
             
            if(!stack.isEmpty() && (operator == '*'||operator == '/')){
                value = operation(stack.pop(),value,operator); 
                
            }
                
            else if(operator == '-' )
                value = value*-1;
           
            stack.push(value);
               i--; 
            }
            else
                operator = s.charAt(i);
            
            
            }
            
        int result = 0;
        while(! stack.isEmpty()){
            
            result += stack.pop();
        }
        return result;
    }
    public int operation (int a, int b , char ch){
        if(ch == '/')
            return a/b;
        else if(ch == '*')
            return a*b;
        else
            return 0;
        
    }
}