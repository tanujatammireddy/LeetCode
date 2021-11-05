class Solution {
    public int[][] updateMatrix(int[][] mat) {
        
        Queue<int[]> queue = new LinkedList();
        int[][] directions = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        int row = mat.length;
        int col = mat[0].length;
        int[][] distance = new int[row][col];
        
        for(int i=0; i < row ;i++){
            for(int j=0; j < col ;j++){
                if( mat[i][j] == 0)
                    queue.add(new int[]{i,j});
                else
                    distance[i][j] = Integer.MAX_VALUE;
            }
        }
        
        while( !queue.isEmpty()){
            
            int[] current = queue.poll();
            
            for(int[] direction:directions){
                
                int X = current[0] + direction[0];
                int Y = current[1] + direction[1];
                
                if(X >= 0 && X < row && Y >= 0 && Y < col && mat[X][Y] == 1 ){
                    if(distance[X][Y] > 1 + distance[current[0]][current[1]]){
                        distance[X][Y] = 1 + distance[current[0]][current[1]];
                        queue.add(new int[]{X,Y});
                    }
                }
            }
            // Mark visited 
            mat[current[0]][current[1]] = 0;
            
        }
        
        return distance;
    }
}