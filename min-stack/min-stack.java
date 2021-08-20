class MinStack {
    public Stack<Integer> stack = new Stack<>();
    public Stack<Integer> minStack = new Stack<>();
    
    void push(int val){
        stack.push(val);
        int min =0;
        if(!minStack.isEmpty()){
            min = minStack.peek() ;
            if(val < min)
            minStack.push(val); 
            else
            minStack.push(min); 
        }
        else
            minStack.push(val); 
       
        
    }
    void pop(){
        stack.pop();
        minStack.pop();
    }
    int top(){
        return stack.peek();
    }
    int getMin(){
        return minStack.peek();    
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */