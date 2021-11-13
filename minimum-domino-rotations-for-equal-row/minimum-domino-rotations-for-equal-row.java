class Solution {
    public int minDominoRotations(int[] top, int[] bottom) {
        
        int minDominoRotations = Integer.MAX_VALUE;
        int x = topRotations(top,bottom,top[0]);
        int y = topRotations(top,bottom,bottom[0]);
        
        int u = bottomRotations(top,bottom,top[0]);
        int v = bottomRotations(top,bottom,bottom[0]);
        
        if(x != -1)
           minDominoRotations =  x;
        if(y != -1)
            minDominoRotations = Math.min(minDominoRotations,y);
        if(u != -1)
            minDominoRotations = Math.min(minDominoRotations,u);
        if(v != -1)
            minDominoRotations = Math.min(minDominoRotations,v);
        
        return (minDominoRotations == Integer.MAX_VALUE) ? -1:minDominoRotations;
       
        
    }
    
    public int topRotations(int[] top, int[] bottoms, int value){
        
        int top_rotation = 0;
        
        for(int i = 0;i< top.length ;i++){
            if(top[i] == value)
                continue;
            if(bottoms[i] == value)
                top_rotation++;
            else
                return -1;
        }
        
        return top_rotation;
        
    }
    public int bottomRotations(int[] top, int[] bottom, int value){
        
        int bottom_rotation = 0;
        
        for(int i = 0;i< bottom.length ;i++){
            if(bottom[i] == value)
                continue;
            if(top[i] == value)
                bottom_rotation++;
            else
                return -1;
        }
        
        return bottom_rotation;
        
    }
}