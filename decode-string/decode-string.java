class Solution {
    
    public Stack<Character> stack;
    public String decodeString(String s) {
        
        stack = new Stack();
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == ']'){
                List<Character> decodedString = new ArrayList<>();
                while (stack.peek() != '[') {
                    decodedString.add(stack.pop());
                }
                stack.pop();
                
                int k= 0;
                int base = 1;
                while( !stack.isEmpty() && Character.isDigit(stack.peek())){
                    k = k + (stack.pop() - '0') * base;
                    base = 10 * base;
                    
                }
                while(k > 0){
                    for (int j = decodedString.size() - 1; j >= 0; j--) {
                        stack.push(decodedString.get(j));
                    }
                    k--;
                }
            }
            else
                stack.push(ch);
         
        }
        
        char[] result = new char[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return new String(result);
        
    }
}