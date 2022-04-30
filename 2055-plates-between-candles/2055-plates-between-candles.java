class Solution {
    
    
    
    
    public int[] platesBetweenCandles(String s, int[][] queries) {
        
        TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
        
        int[] result = new int[queries.length];
        
        int count = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '|'){
               map.put(i,count);
            }
            else
                count++;
            
        }
        
       System.out.println("map"+ map);
        
        for(int i=0 ;i<queries.length;i++){
            try{
                
                Map.Entry<Integer,Integer> startKey = map.ceilingEntry(queries[i][0]);
                Map.Entry<Integer,Integer> endKey = map.floorEntry(queries[i][1]);
                result[i] = (endKey.getValue() - startKey.getValue());
                if(result[i] < 0) result[i] = 0;
            }
            catch(Exception e){
                
            }
            
        }
        
        return result;
        
    }
}