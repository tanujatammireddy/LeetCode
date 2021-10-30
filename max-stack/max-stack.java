class MaxStack {
    List<Integer> list;
    int size;
    int max;
    public MaxStack() {
        list = new LinkedList();
        size = 0;
        max = Integer.MIN_VALUE;
    }
    
    public void push(int x) {
        list.add(x);
        max = Math.max(x,max);
        size++;
    }
    
    public int pop() {
        int ele = list.get(size-1);
        list.remove(size-1);
        size--;
        if(ele == max)
            calculate_max();
        return ele;
    }
    
    public int top() {
        return list.get(size-1);
    }
    
    public int peekMax() {
        return max;
    }
    
    public int popMax() {
        
        int returnvalue = max;
        
        
        for(int i=size-1;i>=0;i-- ){
            if(list.get(i)== max)
            {
                list.remove(i);
                break;
            }
        }
        size--;
        calculate_max();
        return returnvalue;
    }
    public void calculate_max(){
        int local_max = Integer.MIN_VALUE;
        for(int i=0;i<size;i++ ){
            local_max = Math.max(local_max,list.get(i)); 
        }
        max =  local_max;
    }
}

/**
 * Your MaxStack object will be instantiated and called as such:
 * MaxStack obj = new MaxStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.peekMax();
 * int param_5 = obj.popMax();
 */