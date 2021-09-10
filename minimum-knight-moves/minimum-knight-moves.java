class Solution {
    public int minKnightMoves(int x, int y) {
        int[][] directions ={ {-1,-2},{1,-2},{-1,2},{1,2},{-2,-1},{2,1},{2,-1},{-2,1}};
        return bfs(directions,x,y);
    }
   
    public int bfs(int[][] directions,int final_x,int final_y ){
        
        int steps = 0;
        Deque<int[]> queue = new ArrayDeque<int[]>();
        queue.add(new int[]{0, 0});
        
        boolean[][] visited = new boolean[605][605];
        
        while(!queue.isEmpty()){
            int currQueueSize = queue.size();
            for(int i=0; i<currQueueSize; i++){
            int[] curr = queue.poll();
            if(curr[0] == final_x && curr[1] == final_y)
                    return steps;
                
            for(int[] dir:directions){
                int[] next = new int[]{curr[0]+dir[0], curr[1]+dir[1]};
                if (!visited[next[0] + 302][next[1] + 302]) {
                    visited[next[0] + 302][next[1] + 302] = true;
                    queue.addLast(next);
                }    
            }
        }
            steps++;
        }
        
        return steps;
    }
}