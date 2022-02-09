class Solution {
    public int[] findOriginalArray(int[] changed) {
        
        
        int len = changed.length;
        if(len %2 == 1)
            return new int[]{};
        int[] result = new int[len/2];
        int idx = 0;
        int zeroCount = 0;
        HashMap<Integer,Integer> map = new HashMap();
        
        for(int num:changed){
            
            if(num== 0)
                zeroCount++;
            else
            {
                int count = map.getOrDefault(num,0) +1;
                map.put(num,count);
            }
            
            
        }
        
        if(zeroCount > 0)
        {
            if(zeroCount%2 == 1)
                return new int[]{};
        }
        Arrays.sort(changed);
        zeroCount = zeroCount/2;
        for(int num:changed){
            
            if(num == 0) continue;
            int count = map.get(num);
            if(count > 0){
                int doubleValue = num*2;
                int doubleValueCount = map.getOrDefault(doubleValue,0);
                if( doubleValueCount > 0){
                    result[idx] = num;
                    map.put(num,count-1);
                    map.put(doubleValue,doubleValueCount-1);
                    idx++;
                }
            }
            
        }
        
        while(zeroCount >0){
            result[idx] = 0;
            idx++;
            zeroCount--;
        }
        return (idx == len/2)?result:new int[]{};
        
    }
}