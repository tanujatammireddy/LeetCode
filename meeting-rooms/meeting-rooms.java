import java.util.Comparator;
class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        int len = intervals.length;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        for(int i=1;i< len;i++){
            if(intervals[i][0] < intervals[i-1][1])
                return false;
        }
        return true;
    }
}