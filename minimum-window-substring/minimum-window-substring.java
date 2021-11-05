class Solution {
    public String minWindow(String s, String t) {
        
       if(s.length() >= t.length()){
           
            HashMap<Character,Integer> s_map = new HashMap();
            HashMap<Character,Integer> t_map = new HashMap();
        
            for(int i=0; i< t.length() ;i++){
                s_map.put(s.charAt(i),s_map.getOrDefault(s.charAt(i),0)+1);
                t_map.put(t.charAt(i),t_map.getOrDefault(t.charAt(i),0)+1);
            }
          
            if(s_map.equals(t_map)) 
                return s.substring(0,t.length());  
        
            int left = 0; 
            int right = t.length();
            boolean found = false;
            StringBuilder sb = new StringBuilder();
           
           while(right < s.length()){
               
               while(!isEqual(s_map,t_map) && right < s.length()){
                   
                   char charAt_Right = s.charAt(right);
                   s_map.put(charAt_Right,s_map.getOrDefault(charAt_Right,0)+1);
                   right++;
               }
               right--;
               while(isEqual(s_map,t_map)){
                    
                   char charAt_Left = s.charAt(left);
                   s_map.put(charAt_Left,s_map.get(charAt_Left)-1);
                   left++;
                   found = true;
               }
               if(found){
               if(sb.length() == 0)
                    sb.append(s.substring(left-1,right+1));
                else{
                    if(s.substring(left-1,right+1).length() < sb.length()){
                        sb.setLength(0);
                        sb.append(s.substring(left-1,right+1));
                    }
                }
               }
               found = false;
               if(right == s.length()) break;
               right++;
            }
            return sb.toString();
        }
        return "";
    }
    
    public boolean isEqual(HashMap<Character,Integer> s_map, HashMap<Character,Integer> t_map){
        for(Character ch:t_map.keySet()){
            if(!s_map.containsKey(ch))
                return false;
            if(s_map.getOrDefault(ch,0) < t_map.get(ch))
                return false;
        }
        return true;
    }
    
}