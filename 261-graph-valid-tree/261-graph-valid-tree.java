class Solution {
    
    Set<Integer> visited;
    public boolean validTree(int n, int[][] edges) {
        
        List<List<Integer>> adjacencyList = new ArrayList();
        visited = new HashSet();
        
        for(int i=0; i< n;i++){
            adjacencyList.add(new ArrayList());
        }
        
        for(int[] edge:edges){
            
            adjacencyList.get(edge[0]).add(edge[1]);
            adjacencyList.get(edge[1]).add(edge[0]);
        }
        
        if(hasCycle(adjacencyList,0,-1))
            return false;
        
        
        return visited.size() == n ? true:false;
    }
    
    public boolean hasCycle(List<List<Integer>> adjacencyList, int current, int parent){
        
        if(visited.contains(current))
            return true;
        visited.add(current);
        
        //System.out.print(visited);
        
        for(int next: adjacencyList.get(current)){
            if(next != parent){
                if(hasCycle(adjacencyList,next,current))
                    return true;
            }
        }
        
        return false;
    }
}