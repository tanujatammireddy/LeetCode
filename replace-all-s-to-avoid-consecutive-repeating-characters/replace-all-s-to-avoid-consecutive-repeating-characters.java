class Solution {
    public String modifyString(String s) {
        
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int previous_ch = 97;
            int next_ch = 97;
            int asciiValue =97;
            char convertedChar = 'a';
            if(ch=='?'){
                
                if(i-1 >=0) previous_ch = (int)str.charAt(i-1);
                if(i+1 < s.length() && s.charAt(i+1)!= '?') next_ch = (int)s.charAt(i+1);
                
                if(Math.abs(previous_ch-next_ch) > 1 ){
                    asciiValue = Math.min(previous_ch,next_ch)+1;
                }
                else{
                    asciiValue = Math.max(previous_ch,next_ch)+1;
                }
                if(asciiValue <= (int)'z')
                    convertedChar = (char)asciiValue;
                    
              str.append(convertedChar);  
            }
            else
                str.append(ch); 
            
        }
        return str.toString();
    }
}