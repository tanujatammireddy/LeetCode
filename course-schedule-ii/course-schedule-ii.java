class Solution {
    
    int index = 0;
    int[] order;
    boolean[] visited ;
    boolean hasCycle;
    boolean[] set ;
    int n;
    
    public int[] findOrder(int no, int[][] prerequisites) {
        
        List<List<Integer>> adjList = new ArrayList();
        n = no;
        visited = new boolean[n];
        set = new boolean[n];
        order = new int[n];
        
        for(int i= 0 ; i< n ;i++){
            adjList.add(new ArrayList());
        }
        for(int[] preq: prerequisites){
            
            adjList.get(preq[0]).add(preq[1]);
        }
        
        for(int i= 0;i< n;i++){
            if(!visited[i]){
                order(i,adjList);
                
                if(hasCycle)
                    return new int[]{};
            }
        }
        
        return order;
        
        
    }
    
    public void order(int current,List<List<Integer>> adjList){
        
        if(index == n)
            return;
        if(set[current]){
            hasCycle = true;
            return;
        }
        else
            set[current] = true;
        
        for(int preq: adjList.get(current)){
            if( !visited[preq])
            {
                order(preq,adjList);
            }
        }
        
        visited[current] = true;
        order[index] = current;
        index++;
        
    }
}