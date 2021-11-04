class Solution {
    int row ;
    int col;
    int[][] directions;
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        row = image.length;
        col = image[0].length;
        int oldColor   = image[sr][sc];
        directions = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        if(newColor != oldColor)
        backtracking(image,sr,sc,newColor,oldColor);
        return image;
    }
    public void backtracking(int[][] image,int x, int y,int newColor,int oldColor){
        
        if(x >= 0 && x < row && y >= 0 && y< col && image[x][y] == oldColor){
            
            image[x][y] = newColor;
            
            for(int[] direction:directions ){
                int X = x + direction[0];
                int Y = y + direction[1];
                
                backtracking(image,X,Y,newColor,oldColor);
            }
        }
    }
}