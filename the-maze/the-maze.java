class Solution {
    public boolean hasPath(int[][] maze, int[] start, int[] destination) {
        
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        return dfs(maze, start, destination, visited);
    }
    
    public boolean dfs(int[][] maze, int[] start, int[] destination, boolean[][] visited) {
        
        if(start[0] == destination[0] && start[1] == destination[1]) return true;
        if(visited[start[0]][start[1]] == true) return false;
        
        
        int[][] directions ={{0,1},{0,-1},{1,0},{-1,0}};
        visited[start[0]][start[1]] = true;
        
        for(int[] dir:directions){
           int X = start[0];
           int Y = start[1]; 
        while( X >= 0 && X < maze.length && Y >=0 && Y < maze[0].length && maze[X][Y] == 0){
            X += dir[0];
            Y += dir[1];
         }  
        if (dfs(maze,new int[]{X-dir[0],Y-dir[1]},destination,visited))
            return true;
        }
        return false;
    }
        
}