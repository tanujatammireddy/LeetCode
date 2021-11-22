class Solution {
    public int calculate(String s) {
        
        s = s.replace(" ","");
        Stack<Integer> stack = new Stack();
        int sign = 1;
        int i= 0;
        while(i<s.length()){
            
            char ch = s.charAt(i);
            
            if(ch == '*' || ch == '/'){
                
                int firstEle = stack.pop();
                
                int j= i+1;
                int secondEle = 0;
                 while(j < s.length() && Character.isDigit(s.charAt(j)) )
                {
                    secondEle = secondEle*10 + Character.getNumericValue(s.charAt(j));
                    j++; 
                }
                //System.out.println("secondEle"+secondEle);
                
                int result = 0;
                if(ch == '*')
                    result = firstEle*secondEle;
                else
                    result = firstEle/secondEle;
                
                i= j;
                stack.push(result);
            }
            else if(ch == '-' || ch == '+'){
                int j = i+1;
                int num = 0;
                while(j < s.length() && Character.isDigit(s.charAt(j)) )
                {
                    num = num*10 + Character.getNumericValue(s.charAt(j));
                    j++;
                }
                if(ch == '-')
                    stack.push(-num);
                else
                    stack.push(num);
                
                i= j;
                //System.out.println("*******num"+num);
            }
            else{
                
                int j= i;
                int num = 0;
                 while(j < s.length() && Character.isDigit(s.charAt(j)) )
                {
                    num = num*10 + Character.getNumericValue(s.charAt(j));
                    j++; 
                }
                //System.out.println("num"+num);
                stack.push(num);
                i= j;
            }
        }
        int result = 0;
        while(!stack.isEmpty()){
            //System.out.println(stack.peek());
            result += stack.pop();
        }
        
        return result;
    }
}