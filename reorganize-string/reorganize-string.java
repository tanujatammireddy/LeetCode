class Solution {
    public String reorganizeString(String s) {
        
        Map<Character,Integer> map = new HashMap();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        //System.out.print(map);
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue()-a.getValue());
        
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            pq.add(entry);
        }
        StringBuilder SB = new StringBuilder();
        int i=0;
        while(i< s.length() && !pq.isEmpty()){
            
            Map.Entry<Character, Integer> first =  pq.poll(); 
            char ch;
            int first_value = first.getValue();
            if(SB.length() > 0 && SB.charAt(SB.length()-1) == first.getKey() )
            {
                if(pq.isEmpty()) return "";
                Map.Entry<Character, Integer> second =  pq.poll(); 
                ch = second.getKey();
                int value = second.getValue();
                if(value > 1){
                    second.setValue(value-1);
                    pq.add(second);
                }
                
            }
            else{
                ch = first.getKey();
                first_value--;
            }
            
            if(first_value > 0){
                    first.setValue(first_value);
                    pq.add(first);
            }
            SB.append(ch);
            i++;
        }
        return SB.toString();
        
    }
}