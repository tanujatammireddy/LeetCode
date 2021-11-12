class Solution {
    public int minMeetingRooms(int[][] intervals) {
        
        int count = 0;
        int len = intervals.length;
        if(len < 2)
            return len;
        int[] start_Time = new int[len];
        int[] end_Time = new int[len];
        
        for(int i=0;i< len;i++){
            start_Time[i] =  intervals[i][0];
            end_Time[i] = intervals[i][1];
        }
        Arrays.sort(start_Time);
        Arrays.sort(end_Time);
        int start =0;
        int end =0;
        while(start < len && end < len){
            if(start_Time[start] >= end_Time[end])
            {   
                count--;
                end++;
            }
              count++;
              start++;
                
                
        }
        
        return count;
    }
}