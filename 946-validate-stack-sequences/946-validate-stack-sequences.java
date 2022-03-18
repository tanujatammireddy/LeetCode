class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        
        Stack<Integer> stack = new Stack<Integer>();
        int idx = 0;
        int len = pushed.length;
        for(int i=0 ;i< len;i++){
            stack.push(pushed[i]);
            while(!stack.isEmpty() && idx < len && popped[idx] == stack.peek()){
                stack.pop();
                idx++;
            }
        }
        return idx == len;
    }
}