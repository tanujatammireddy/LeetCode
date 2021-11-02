class Solution {
    public int minCost(String s, int[] cost) {
        
        List<Pair<Integer,Integer>> list = new ArrayList();
        boolean duplicate = false;
        int count = 0;
        for(int i= 1; i < s.length() ;i++){
            
            int start = i-1;
            char ch_start = s.charAt(start);
            duplicate = false;
            
            while( i< s.length() && ch_start == s.charAt(i)){
                duplicate = true;
                i++;
            }
            if(duplicate){
                i = i-1;
                list.add(new Pair(start,i)); 
            }    
        }
        
        
        for(Pair p:list){
            
            int start = (Integer)p.getKey();
            int end = (Integer)p.getValue();
            
            int sum = 0;
            int max = -1;
            
            for(int i=start; i<= end; i++){
                sum += cost[i];
                max = Math.max(max,cost[i]);
            }
            sum = sum - max;
            count = count+ sum;
            
        }
        
        return count;
    }
}