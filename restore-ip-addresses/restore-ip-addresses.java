class Solution {
    List<String> returnList;
    public List<String> restoreIpAddresses(String s) {
        returnList = new ArrayList();
        if(s.length() >= 4){
            backTracking(s,0,0,new Integer[4]);
        }
        return returnList;
    }
    
    public void backTracking(String s, int segment, int pointer,Integer[] IPSegments ){
        
     
        if(segment == 4){
            if(pointer == s.length()){
                String str = String.valueOf(IPSegments[0])+"."+ String.valueOf(IPSegments[1])+"."   +String.valueOf(IPSegments[2])+"." +String.valueOf(IPSegments[3]);
                
                returnList.add(str.toString());
            }
            return;
        }
        
        for(int i= 1; i<=3 ;i++){
        
            int len = pointer + i;
            
            if(len > s.length())
                return;
            
            String sb = s.substring(pointer,len);
            int value = Integer.parseInt(sb);
            
            if(sb.charAt(0) == '0' && sb.length() > 1)
                return;
            if(value > 255)
                return;
            
            IPSegments[segment] = value;
            backTracking(s,segment+1,pointer+i,IPSegments);
            

        }
        
        
    }
    
    
}