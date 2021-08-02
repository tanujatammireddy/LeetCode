class Solution {
    public int count=-1;
    public  int freshOranges = 0;
    public int orangesRotting(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        int[][] directions ={{0,1},{1,0},{0,-1},{-1,0}};
        
        List<Pair<Integer,Integer>> list = new ArrayList();
        for(int i=0;i< row ;i++){
            for(int j=0;j< col;j++){
                if(grid[i][j]== 2){
                    list.add(new Pair(i,j));
                }
                if(grid[i][j]== 1)
                freshOranges++;
            }
        }
        if(list.size()==0 && freshOranges == 0) return 0;
        if(list.size()==0 && freshOranges != 0) return -1;
        orangesRotten(grid,list,row,col,directions);
        if(freshOranges == 0) 
        return count;
        else
            return -1;
    }
    public void orangesRotten(int[][] grid, List<Pair<Integer,Integer>> list,int row, int col, int[][] directions){
        
        
       // System.out.println(""+list);
        if(!list.isEmpty()) {
            count++;
            List<Pair<Integer,Integer>> newlist = new ArrayList();
            for(Pair p:list){
                int x =(int) p.getKey();
                int y =(int) p.getValue();
                for(int[] dir: directions){
                    int new_x = x + dir[0];
                    int new_y = y + dir[1];
                    if(new_x >= 0 && new_x < row && new_y >= 0 && new_y < col && grid[new_x][new_y]==1){
                        grid[new_x][new_y] =2;
                        newlist.add(new Pair(new_x,new_y));
                        freshOranges--;
                    }
                    
                }
            }
            if(!newlist.isEmpty() )
           orangesRotten(grid,newlist,row,col,directions); 
        }
    }
    
}