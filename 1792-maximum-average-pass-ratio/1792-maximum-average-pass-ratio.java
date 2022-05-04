class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        
        double avg = 0;
        double count = classes.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                
                double a1 = (double)a[0]/(double)a[1];
                double a2 = (double)(a[0]+1)/(double)(a[1]+1);
                
                double d1 = a2 - a1;
                
                double b1 = (double)b[0]/(double)b[1];
                double b2 = (double)(b[0]+1)/(double)(b[1]+1);
                
                double d2 = b2 - b1;
                
                return -Double.compare(d1, d2);
                
            }
        });
        
        for(int[] exam: classes){
            pq.offer(exam);
        }
        
        while(extraStudents >0){
            int[] current = pq.poll();
            //System.out.println(Arrays.toString(current));
            current[0]++;
            current[1]++;
            pq.add(current);
            extraStudents--;
        }
        
        while(!pq.isEmpty())
        {
            int[] current = pq.poll();
            avg+= (double)current[0]/(double)current[1];
        }
        return avg/count;
        
    }
}