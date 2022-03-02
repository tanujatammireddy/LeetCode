class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        if(image[sr][sc] != newColor)
            helper(sr,sc,image,newColor,image[sr][sc]);  
        
        return image;
        
    }
    
    public void helper(int x,int y,int[][] image,int newColor,int oldColor){
        
        if(x >=0 && x< image.length && y>=0 && y <image[0].length && image[x][y] == oldColor){
            
            image[x][y] = newColor;
            helper(x+1,y,image,newColor,oldColor); 
            helper(x-1,y,image,newColor,oldColor); 
            helper(x,y+1,image,newColor,oldColor); 
            helper(x,y-1,image,newColor,oldColor); 
            
        }
    }
}