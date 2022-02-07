class Solution {
    public int[] findOriginalArray(int[] changed) {
        
        int len = changed.length;
        if(len%2 == 1)
            return new int[]{};
        Map<Integer,Integer> map = new HashMap();
        int zeroCount = 0;
        int idx = 0;
        int[] result = new int[changed.length/2];
        
        for(int i=0 ;i< len;i++){
            
            int val = changed[i];
            if(val == 0)
            {
                zeroCount++;
                continue;
            }
            int count = map.getOrDefault(val,0)+1;
            map.put(val,count);
        }
        
         if(zeroCount%2 == 1)
            return new int[]{};
        zeroCount = zeroCount/2;
        while(zeroCount > 0){
            result[idx] = 0;
            idx++;
            zeroCount--;
        }
        
        Arrays.sort(changed);
        for(int curr: changed){
            if(curr == 0)
                continue;
            int count = map.get(curr);
            if(count > 0){
                
                int double_value_count = map.getOrDefault(curr*2,0);
                if(double_value_count > 0){
                    result[idx] = curr;
                    idx++;
                    map.put(curr*2,double_value_count-1);
                    map.put(curr,count-1);
                }
                
                
            }
            }
        
        return (idx == len/2)?result:new int[]{} ;
    }
}