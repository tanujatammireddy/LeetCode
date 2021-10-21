class Solution {
    public String validIPAddress(String IP) {
        
        if(IP.isBlank() || IP.isEmpty()) return "Neither";
        if(IP.charAt(IP.length()-1) =='.'||IP.charAt(IP.length()-1) ==':')
            return "Neither";
        //IPv4
        if(IP.contains(".")){
            String[] nodes = IP.split("\\.");
            if(nodes.length != 4)
                return "Neither";
            for(String current: nodes){
                if(!validIPv4(current))
                    return "Neither";
            }
            return "IPv4";
        }
        //IPv6
        else if(IP.contains(":")){
            String[] nodes= IP.split(":");
            if(nodes.length != 8)
                return "Neither";
            for(String current: nodes){
                if(!validIPv6(current))
                    return "Neither";
            }
            return "IPv6";
        }
        
        return "Neither";
    }
    
    public boolean validIPv6(String s){
        
        if(s.length() == 0 ||s.length() > 4)  return false;
        
        //To find if it contains any character other than 0-9,a-f,A-F 
        int index = 0;
        while(index < s.length()){
            char ch = s.charAt(index);
            if(!((ch >='0' && ch<='9') ||(ch>='a' && ch<='f')||(ch>='A' && ch<='F')))
                break;
          index++;  
        }
              
        if(index != s.length()) return false;
         
        return true;
    }
    
    public boolean validIPv4(String s){
        
        if(s.length() == 0 ||s.length() > 3)  return false;
        
        int index = 0;
        int count = 0;
        
        // To find the leading zeros
        while(index < s.length() && s.charAt(index) == '0'){
            ++count;
            ++index;
        }
        if(count > 1) return false;
        
        //To find if it contains any character other than digits
        index = 0;
        while(index < s.length() && Character.isDigit(s.charAt(index)))
              index++;
        if(index != s.length()) return false;
             
        int value = Integer.parseInt(s);
        if(count == 1  && value != 0) return false;
        if(value < 0 || value > 255) return false;
        
        return true;
    }
}