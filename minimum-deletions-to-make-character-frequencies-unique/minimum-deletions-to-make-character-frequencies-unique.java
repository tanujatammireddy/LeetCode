class Solution {
    public int minDeletions(String s) {
    int count = 0;
    Map<Character,Integer> map = new HashMap();
    Set<Integer> frequency = new HashSet();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        for(int num:map.values()){
            while(frequency.contains(num)){
                num--;
                count++; 
            }
            if(num!=0)
            frequency.add(num);
            }
        
     return count;   
    }
}