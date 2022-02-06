class Solution {
    
    public int minimumCost(int n, int[][] connections) {
        
        int minimumCost = 0;
        
        List<List<Edge>> adjacencyList = new ArrayList();
        
        for(int i= 0 ;i<= n ;i++){
            adjacencyList.add(new ArrayList());
        }
        
        for(int[] connection: connections){
            adjacencyList.get(connection[0]).add(new Edge(connection[0],connection[1],connection[2]));
            adjacencyList.get(connection[1]).add(new Edge(connection[1],connection[0],connection[2]));  
        }
        
        Set<Integer >visited = new HashSet();
        Queue<Edge> pq = new PriorityQueue();
        
        pq.add(new Edge(0,1,0));
        
        while( !pq.isEmpty()){
            
            Edge current = pq.poll();
            int next_start = current.end;
            if(visited.contains(next_start))
                continue;
            else
            {
                minimumCost += current.cost;
                visited.add(next_start);
                for(Edge next: adjacencyList.get(next_start)){
                    if(!visited.contains(next.start) || !visited.contains(next.end))
                    pq.add(next);
                }
                    
            }
            
            
            
        }
        
        return (visited.size() == n)?minimumCost:-1;
        
    }
    
    public class Edge implements Comparable<Edge>{
        
        int start;
        int end;
        int cost;
        
        public Edge(int start,int end,int cost){
            this.start = start;
            this.end = end;
            this.cost = cost;
        }
        
        @Override
        public int compareTo(Edge other){
            return this.cost-other.cost;
        }
    }
}