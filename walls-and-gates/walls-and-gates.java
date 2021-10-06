class Solution {
    public void wallsAndGates(int[][] rooms) {
    if(rooms == null || rooms.length == 0 || rooms[0].length == 0)
        return;
           
    for(int i = 0; i < rooms.length; i++) {
        for(int j = 0; j < rooms[0].length; j++) {
            if(rooms[i][j] == 0){
                int dis = 0;
                helper(rooms, i, j, dis);
            }
        }
    }
    
    return;
}
public void helper(int[][] rooms, int i, int j, int dis) {
    int[] X = {0, 1, 0, -1};
    int[] Y = {1, 0, -1, 0};
    
    
    for(int k = 0; k < 4; k++) {
        if(inBounds(rooms, i + X[k], j + Y[k]) && dis + 1 < rooms[i + X[k]][j + Y[k]]) {
            rooms[i + X[k]][j + Y[k]] = dis + 1;
            helper(rooms, i + X[k], j + Y[k], dis + 1);
        }                               
    }
}
public boolean inBounds(int[][] rooms, int x, int y) {
    return x >= 0 && x < rooms.length && y >= 0 && y < rooms[0].length;
}
}