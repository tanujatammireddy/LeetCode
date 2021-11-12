class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a,b)->a[2]-b[2]);
        int[][] kClosestPoints = new int[k][2];
        for(int[] point:points){
            int distance = (point[0]*point[0])+(point[1]*point[1]);
            pq.add(new int[]{point[0],point[1],distance});
        }
        
        for(int i=0;i<k;i++){
            int[] current = pq.poll();
            kClosestPoints[i][0] = current[0];
            kClosestPoints[i][1] = current[1];
        }
        
        return kClosestPoints;
    }
}