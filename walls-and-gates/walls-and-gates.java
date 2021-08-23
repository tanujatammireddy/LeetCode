class Solution {
    
    public int emptyRoom = 2147483647;
    public int obstacle = -1;
    public int gate = 0;
    
    public int[][] directions = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
    Queue<Pair<Integer,Integer>> queue = new LinkedList();
    
    public void wallsAndGates(int[][] rooms) {
        
            for(int i=0; i<rooms.length; i++){
              for(int j=0; j<rooms[0].length; j++){
                if(rooms[i][j] == 0){
                   queue.add(new Pair(i,j)); 
                }
            }
            }
            if(!queue.isEmpty())
            bfs(queue,rooms);
    }
    
    public void bfs(Queue<Pair<Integer,Integer>> queue,int[][] rooms){
        
        while(!queue.isEmpty()){
            Pair p = queue.poll();
            int x = (int)p.getKey();
            int y = (int)p.getValue();
            
            for(int[] dir: directions){
                int X = x + dir[0];
                int Y = y + dir[1];
                
                if(X>=0 && X< rooms.length && Y>=0 && Y<rooms[0].length && rooms[X][Y] == emptyRoom){
                   rooms[X][Y] = rooms[x][y] + 1; 
                   queue.add(new Pair(X,Y)); 
                }
            }
        }
    }
}