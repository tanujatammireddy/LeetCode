class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character,Integer> orderMap = new HashMap();
        int k=1;
         orderMap.put('∅',0);
        for(char ch: order.toCharArray()){
            orderMap.put(ch,k);
            k++;
        }
        
        
        
        for(int i=1;i<words.length;i++){
            String previous= words[i-1];
            String current = words[i];
            char previous_ch = previous.charAt(0);
            char current_ch = current.charAt(0);
            if(orderMap.get(previous_ch)> orderMap.get(current_ch)){
                return false;
            }
            else if (orderMap.get(previous_ch) == orderMap.get(current_ch)){
                
            char[] previousArray = previous.toCharArray();
            char[] currentArray = current.toCharArray();
            int length = Math.min(current.length(),previous.length());
            int index = 0;
            while(index <=length){
                if(index ==length){
                    if(previousArray[index-1]==currentArray[index-1]&& previousArray.length > length) {
                        return false;
                    }
                }
                else{
                     if(orderMap.get(previousArray[index]) > orderMap.get(currentArray[index]))
                     return false; 
                    }
                  index++;  
                }
            }
            
        }
        return true;
        
    }
}