class Solution {
    Stack<Integer> stack = new Stack();
    public String minRemoveToMakeValid(String s) {
        Set<Integer> charToRemove = new HashSet();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
                if(ch=='(') 
                    stack.push(i);
                else if(ch==')'){
                       if(stack.isEmpty())
                           charToRemove.add(i);
                       else
                           stack.pop();
                    } 
                
        }
         while(!stack.isEmpty())
            charToRemove.add(stack.pop());
        
            StringBuilder str = new StringBuilder();
              for(int i=0;i<s.length();i++){
                    char ch = s.charAt(i);
                 if(!charToRemove.contains(i))
                    str.append(ch); 
                else
                    charToRemove.remove(ch);
                 
             }
              return str.toString();
        }
    }