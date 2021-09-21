class Solution {
    public int row, col;
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int[][] direction = {{-1,0},{0,-1},{1,0},{0,1}};
        int oldColor = image[sr][sc];
        if(oldColor != newColor){
        row = image.length;
        col = image[0].length;
        dfs(image,direction,sr,sc,newColor,oldColor);
        }
        return image;
    }
    public void dfs(int[][] image,int[][] direction, int sr, int sc, int newColor, int oldColor){
        
        image[sr][sc] = newColor;
        for(int[] dir: direction){
            int x = sr + dir[0];
            int y = sc + dir[1];
            
            if(x >= 0 && x< row && y>=0 && y<col && image[x][y] == oldColor)
                dfs(image,direction,x,y,newColor,oldColor);
        }
    }
}