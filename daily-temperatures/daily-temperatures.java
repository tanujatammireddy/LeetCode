class Solution {
    public int[] dailyTemperatures(int[] temp) {
        
        Stack<Pair<Integer,Integer>> stack = new Stack();
        int len = temp.length;
        int[] ans = new int[len];
        
        for(int i=0;i< len;i++){
            
            while(!stack.isEmpty())
            {
                Pair p = stack.peek();
                int temperature = (Integer)p.getKey();
                if(temperature < temp[i])
                {
                    int index = (Integer)p.getValue();
                    ans[index] = i-index;
                    stack.pop();
                }
                else
                    break;
            }
                stack.push(new Pair(temp[i],i));
            
            }
        
        return ans;
        
    }
}