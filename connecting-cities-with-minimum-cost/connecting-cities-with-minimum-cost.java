class Solution {
    public int minimumCost(int n, int[][] connections) {
        
        int minimumCost = 0;
        int citiesVisited = 0;
        boolean[] visited = new boolean[n+1];
        List<List<Edge>> adjList = new ArrayList();
        
        for(int i= 0 ; i<=n ;i++){
           adjList.add(new ArrayList()); 
        }
        for(int[] edge: connections){
            
            adjList.get(edge[0]).add(new Edge(edge[0],edge[1],edge[2])); 
            adjList.get(edge[1]).add(new Edge(edge[1],edge[0],edge[2])); 
        }
        
        PriorityQueue<Edge> pq = new PriorityQueue();
        pq.add(new Edge(0,1,0));
        
        while(!pq.isEmpty()){
            
            Edge current = pq.poll();
            int destination = current.end;
            
            if(visited[destination])
                continue;
            
            citiesVisited++;
            minimumCost += current.cost;
            visited[destination] = true;
            
            if(citiesVisited == n)
                break;
            
            for(Edge next: adjList.get(destination)){
                if(!visited[next.end])
                    pq.add(next);
            }
            
        }
        
        
        return (citiesVisited == n) ? minimumCost : -1;
    }
    
    public class Edge implements Comparable<Edge>{
        int start;
        int end;
        int cost;
    public Edge(int start, int end, int cost){
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