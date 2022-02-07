class Solution {
    public int shortestPath(int[][] grid, int k) {
        
        Queue<state> queue = new LinkedList();
        
        int[][] directions= {{0,1},{0,-1},{1,0},{-1,0}};
        int row = grid.length-1;
        int col = grid[0].length-1;
        
        // Manhattan distance 
        if (k >= row+col ) 
            return row + col;
        
        Set<state> visited = new HashSet();
        
        state start = new state(0,0,k,0);
        queue.add(start);
        visited.add(start);
        
        
        while(!queue.isEmpty())
        {
            state current = queue.poll();
            int x = current.x;
            int y = current.y;
            int obs = current.k;
            if( x== row && y== col)
                return current.steps;
            
            if (grid[x][y] == 1) {
                obs--;
                if (obs < 0) continue;
            }
            
            for(int[] dir: directions)
            {
                int X = x + dir[0];
                int Y = y + dir[1];
                int steps = current.steps;
                
                if(X>=0 && X<=row && Y>=0 && Y<= col)
                {
                    state neighbour = new state(X,Y,obs,steps+1);
                    if(!visited.contains(neighbour)){
                        visited.add(neighbour);
                        queue.add(neighbour);
                    }
                    
                }
            }
                
        }
        
        return -1;
        
    }
    class state{
        int x;
        int y;
        int k;
        int steps;
        
        public state(int x,int y, int k, int steps){
            this.x = x;
            this.y = y;
            this.k = k;
            this.steps = steps;
            
        }
        @Override
        public int hashCode(){
            return (this.x+1)*(this.y+1)*(this.k);
        }
        @Override
        public String toString(){
            return String.valueOf(this.x)+String.valueOf(this.y) + String.valueOf(this.k);
        }
        
        @Override
        public boolean equals(Object other){
            
            if(other == null) 
                return false;
            if (!(other instanceof state)) 
                return false;
            state newState = (state) other;
            return (newState.x == this.x)&&(newState.y == this.y)&&(newState.k == this.k);
        }
    }
}