class Solution {
    public int[][] merge(int[][] intervals) {
        
        if(intervals.length <= 1)
            return intervals;
        
        List<int[]> list = new ArrayList();
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        list.add(intervals[0]);
        
        for(int i=1 ; i< intervals.length; i++){
            int[] previous = list.get(list.size()-1);
            int[] current = intervals[i];
            if( current[0] <= previous[1] ){
                list.remove(list.size()-1);
                list.add(new int[]{previous[0],Math.max(current[1],previous[1])});
            }
            else
                list.add(current);
        }
        
        int[][] result = new int[list.size()][2];
        int idx = 0;
        for(int[] current : list){
            result[idx] = current;
            idx++;
        }
        
        return result;
        
    }
}