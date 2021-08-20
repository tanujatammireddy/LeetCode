class Solution {
    
    public int time = -1;
    public int freshOranges = 0;
    public int orangesRotting(int[][] grid) {
        
        Queue<Pair<Integer,Integer>> queue = new LinkedList<>();
        boolean[][] visited  = new boolean[grid.length][grid[0].length];
        
        
        for(int i=0;i< grid.length;i++){
            for(int j=0; j<grid[0].length;j++){
                if(grid[i][j] == 2){
                    queue.add(new Pair(i,j));
                    visited[i][j] = true; 
                }
                if(grid[i][j] == 1){
                    this.freshOranges++;
                }
                
            }
        }
        queue.add(new Pair(-1,-1));
        bfs(queue,grid,visited);
        
        time = this.freshOranges == 0 ? time : -1 ;
        return time;
        
    }
    
    public void bfs(Queue<Pair<Integer,Integer>> queue, int[][] grid,boolean[][] visited){
        
        int[][] directions = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
        while(!queue.isEmpty()){
            
         Pair<Integer,Integer> p = queue.poll();
            int x = p.getKey();
            int y = p.getValue();
            //System.out.println("x: "+x+" y: "+y);
            if(x == -1){
                this.time++;
                if (!queue.isEmpty())
                    queue.add(new Pair(-1,-1));
            }
            else{
                boolean flag = false;
                for(int[] dir: directions){
                int X = x + dir[0];
                int Y = y + dir[1];
                if(X >= 0 && X < grid.length && Y >= 0 && Y < grid[0].length && grid[X][Y] == 1 && visited[X][Y] == false ){
                    queue.add(new Pair(X,Y));
                    visited[X][Y] = true; 
                    grid[X][Y] = 2; 
                    this.freshOranges--;
                }
            }
            
        }
        
    }
}
}