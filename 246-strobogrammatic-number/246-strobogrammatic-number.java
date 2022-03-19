class Solution {
    public boolean isStrobogrammatic(String num) {
        Map<Character,Character> map = new HashMap();
        map.put('1','1');
        map.put('0','0');
        map.put('6','9');
        map.put('9','6');
        map.put('8','8');
        
        StringBuilder sb = new StringBuilder();
        for(char ch: num.toCharArray()){
            if(map.containsKey(ch)){
               sb.append(map.get(ch));
            }
            else
                return false;
        }
        sb = sb.reverse();
        
        return sb.toString().equals(num);
        
    }
}