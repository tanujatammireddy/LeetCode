class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals,(a, b) -> a[0] - b[0]);
        
        List<int[]> list = new ArrayList();
        list.add(new int[]{intervals[0][0],intervals[0][1]});
        
        for(int i= 1; i< intervals.length ;i++){
            
            int[] previous = list.get(list.size()-1);
            int previous_start = previous[0]; 
            int previous_end = previous[1]; 
            
            int current_start = intervals[i][0];
            int current_end = intervals[i][1];
            
            if(current_start <= previous_end){
                previous[1] = Math.max(previous_end,current_end);
                list.remove(list.size()-1);
                list.add(previous);
            }
            else
                list.add(new int[]{current_start,current_end});
        }
        
        
        return list.toArray(new int[list.size()][]);
    }
}