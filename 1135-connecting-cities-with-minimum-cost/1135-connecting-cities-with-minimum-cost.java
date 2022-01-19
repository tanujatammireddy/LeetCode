class Solution {
    public int minimumCost(int n, int[][] connections) {
        
        int minCost = 0;
        int citiesVisited = 0;
        boolean[] visited = new boolean[n+1];
        List<List<Edge>> adjacencyList = new ArrayList();
        
        for(int i= 0 ;i<= n ;i++){
            adjacencyList.add(new ArrayList());
        }
        
        for(int[] connection: connections){
            adjacencyList.get(connection[0]).add(new Edge(connection[0],connection[1],connection[2]));
            adjacencyList.get(connection[1]).add(new Edge(connection[1],connection[0],connection[2]));  
        }

        Queue<Edge> queue = new PriorityQueue();
        queue.add(new Edge(0,1,0));
        
        while(!queue.isEmpty()){
            
            Edge current = queue.poll();
            if(!visited[current.end]){
                visited[current.end] = true;
                citiesVisited++;
                minCost += current.cost;
            
                for(Edge next: adjacencyList.get(current.end)){
                    if(!visited[next.end])
                        queue.add(next);
                }
            }
            
            
        }
        
        return (citiesVisited == n)? minCost :-1;
    }
    
    public class Edge implements Comparable<Edge>{
        int start;
        int end ;
        int cost;
    
    public Edge(int start, int end , int cost){
        this.start = start;
        this.end = end;
        this.cost = cost;
    }
    
    @Override
    public int compareTo(Edge other){
        return cost-other.cost;
    }
    }
    
}