class Solution {
   public static int minimumTotal(List<List<Integer>> triangle) {
        int result=0;
        int currentNode=0 ;
        int triangleSize = triangle.size();
        int[] dp = new int[triangleSize+1];
        for (int i = triangleSize-1; i >=0; i--) {
            for (int j = 0; j <= i; j++) {
                int current = triangle.get(i).get(j);
                dp[j] = Math.min(dp[j+1],dp[j])+ current;
            }
        }
          
        return dp[0];
    }
}