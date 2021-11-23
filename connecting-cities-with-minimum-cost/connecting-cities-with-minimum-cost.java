class Solution {
    public int minimumCost(int n, int[][] connections) {
        
        int minimumCost = 0;
        int citiesVisited = 0;
        
        PriorityQueue<Edge>  pq = new  PriorityQueue();
        boolean[] visited = new boolean[n+1];
        Map<Integer, List<Edge>> map = new HashMap();
        
        
        for(int[] connection:connections){
            
            if(!map.containsKey(connection[0]))
                map.put(connection[0], new ArrayList());
            if(!map.containsKey(connection[1]))
                map.put(connection[1], new ArrayList());
            
            map.get(connection[1]).add(new Edge(connection[1],connection[0],connection[2]));
            map.get(connection[0]).add(new Edge(connection[0],connection[1],connection[2]));
        }
        
        pq.add(new Edge(0,1,0));
        while(!pq.isEmpty())
        {
            Edge current = pq.poll();
            int destination = current.end;
            System.out.println(""+destination);
            
            if(visited[destination])
                continue;
            citiesVisited++;
            
            minimumCost += current.cost;
            visited[destination] = true;
            
            for(Edge next : map.get(destination)){
                if(!visited[next.end])
                    pq.add(next);
                    
            }
            
        }
       
        return (citiesVisited != n)? -1: minimumCost;
        
    }
    
    public class Edge implements Comparable<Edge> {
        int start;
        int end;
        int cost;
        public Edge(int s,int e,int c){
            start = s;
            end = e;
            cost = c;
        }
        @Override
        public int compareTo(Edge other) {
            return cost - other.cost;
        }
    }
}