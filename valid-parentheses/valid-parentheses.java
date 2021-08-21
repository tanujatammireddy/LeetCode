class Solution {
    public boolean isValid(String s) {
        
        if(s.isEmpty()|| s.isBlank()) return true;
        
        Map<Character,Character> map = new HashMap();
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');
        
        Stack<Character> stack = new Stack();
        
        for(char ch:s.toCharArray()){
            if(ch=='{'||ch=='('||ch=='['){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty())
                    return false;
                if(stack.peek() == map.get(ch))
                    stack.pop();
                else 
                    stack.push(ch);
            }
        }
        
        if(stack.isEmpty())
            return true;
        else
            return false;
        
        
    }
}