class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        int maximalNetworkRank = 0;
        int[] degree = new int[n];
        boolean[][] connected = new boolean[n][n];
        for(int[] road: roads){
            degree[road[0]]++;
            degree[road[1]]++;
            connected[road[0]][road[1]] = true;
            connected[road[1]][road[0]] = true;
        }
        
        int networkRank = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
              networkRank =  degree[i]+degree[j];
                if(connected[i][j] || connected[j][i])
                    networkRank --;
                
                maximalNetworkRank= Math.max(maximalNetworkRank,networkRank);      
            }
        }
        
        return maximalNetworkRank;
        
    }
}