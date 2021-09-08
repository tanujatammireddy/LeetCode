class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> unSortedMap = new HashMap();
        for(int num:nums){
            unSortedMap.put(num,unSortedMap.getOrDefault(num,0)+1);  
        }
        
        int[] returnvalue = new int[k];
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        unSortedMap.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .forEachOrdered(x -> map.put(x.getKey(), x.getValue()));
        
        int i=0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            returnvalue[i] =(int) entry.getKey() ;
            i++;
            if(i== k) break;
        }
        
        return returnvalue;
    }
}