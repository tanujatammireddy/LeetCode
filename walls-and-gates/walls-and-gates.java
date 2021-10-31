class Solution {
    public void wallsAndGates(int[][] rooms) {
        
        Queue<int[]> queue = new LinkedList<int[]>();
        
        for(int i=0; i<rooms.length; i++){
            for(int j=0; j<rooms[0].length; j++){
                if(rooms[i][j] == 0)
                    queue.add(new int[]{i,j,0});
            } 
        }
        
        if(!queue.isEmpty()){
        int[][] directions = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            //System.out.print(Arrays.toString(current));
            int distance = current[2];
            rooms[x][y] = Math.min(rooms[x][y],distance); 
            for(int[] dir:directions){
                int X = x + dir[0];
                int Y = y + dir[1];
                if(X >= 0 && Y>=0 && X< rooms.length && Y< rooms[0].length && rooms[X][Y] == 2147483647)
                    queue.add(new int[]{X,Y,distance+1});
            }
        }
        }
    }
    
    
}