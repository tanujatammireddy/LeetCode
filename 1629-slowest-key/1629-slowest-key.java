class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        
        TreeMap<Integer,List<Character>> map = new TreeMap();
        char[] charArray = keysPressed.toCharArray();
        map.put(releaseTimes[0],new ArrayList<Character>());
        map.get(releaseTimes[0]).add(charArray[0]);
        
        for(int i=1; i< releaseTimes.length;i++){
            
            int time = releaseTimes[i] -releaseTimes[i-1];
            if(!map.containsKey(time))
                 map.put(time,new ArrayList<Character>());
            map.get(time).add(charArray[i]);
            
        }
        
        List<Character> list = map.get(map.lastKey()); 
        if(list.size() >1)
            Collections.sort(list);
        
        return list.get(list.size()-1);
    }
}