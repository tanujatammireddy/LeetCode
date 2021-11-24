class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        
        if(firstList.length == 0 || secondList.length == 0)
            return new int[][]{};
        
        int len1 = firstList.length;
        int len2 = secondList.length;
        List<int[]> result = new ArrayList();
        
        //int[][] result = new int[len][2];
        int i= 0, j= 0;
        int start_1,end_1,start_2,end_2;
        
        while(i<len1 && j< len2){
            
            start_1 = firstList[i][0];
            end_1   = firstList[i][1];
            start_2 = secondList[j][0];
            end_2   = secondList[j][1];
            
            
            if(start_2 <= end_1 && start_1 <= end_2){
            int start = Math.max(start_1,start_2);
            int end = Math.min(end_1,end_2);
            
            result.add(new int[]{start,end});
            }
            
            if(end_1 < end_2 )
                i++;
            else
                j++;
            
        }
        
        int n = result.size();
        int[][] closed_interval = new int[n][2];
        for(int idx =0; idx< n ;idx++)
        {
           closed_interval[idx] = result.get(idx); 
        }
       
       return closed_interval;
        
    }
}