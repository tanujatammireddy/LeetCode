class Solution { 
    
    public int scoreOfParentheses(String s) {
        
        Stack<Integer> stack =  new Stack<Integer>();
        stack.push(0);
        int idx = 0;
        
        while(idx < s.length()){
            char c = s.charAt(idx);
            if(c == '(')
                stack.push(0);  
            else
                stack.push(Math.max(2*stack.pop(),1)+stack.pop());  
            idx++; 
        }
        
        return stack.pop();
        
    }
}