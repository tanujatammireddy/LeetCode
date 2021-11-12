class Solution {
    int[][] directions;
    boolean[][] visited = new boolean[605][605];
    public int minKnightMoves(int x, int y) {
        directions =new int[][] { {-1,-2},{1,-2},{-1,2},{1,2},{-2,-1},{2,1},{2,-1},{-2,1}};
        return bfs(x,y);
    }
   
    public int bfs(int x, int y){
        
        Queue<int[]> queue = new LinkedList<int[]>();
        queue.add(new int[]{0,0});
        
        int steps = 0;
        
        while(!queue.isEmpty()){
            
            int size = queue.size();
            
            for(int i=0; i<size; i++){
                int[] current = queue.poll();
                int X = current[0];
                int Y = current[1];
    
                if(X == x && Y == y)
                    return steps;
            
                for(int[] dir:directions ){
                    
                    if(!visited[302+X+dir[0]][302+Y+dir[1]]){
                        
                        visited[302+X+dir[0]][302+Y+dir[1]]= true;
                        queue.add(new int[]{X+dir[0],Y+dir[1]});
                        
                    }
                }
            }
           steps++; 
        }
        return steps;
    }
}