class Solution {
    public List<List<Integer>> removeInterval(int[][] intervals, int[] toBeRemoved) {
        
        List<List<Integer>> returnList = new ArrayList();
        
        for(int[] interval: intervals){
            
            int start = interval[0];
            int end = interval[1];
            List<Integer>list = new ArrayList();
            
            // Out of range to be removed:
            if(end < toBeRemoved[0]|| start > toBeRemoved[1]){
                list.add(start);
                list.add(end);
                returnList.add(list);
                continue;
            }
            // start lies between the to be removed range
            if(start < toBeRemoved[0] && end > toBeRemoved[0]){
                list.add(start);
                list.add(toBeRemoved[0]);
                returnList.add(list);
            }
            // end lies between the to be removed range
            if(end >  toBeRemoved[1]){
                List<Integer>sublist = new ArrayList();
                sublist.add(toBeRemoved[1]);
                sublist.add(end);
                returnList.add(sublist);
            }   
        }
        
        return returnList;
        
    }
}