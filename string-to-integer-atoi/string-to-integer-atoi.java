class Solution {
    public int myAtoi(String s) {
        
        if(s == null || s.isEmpty()) return 0;
        int i = 0;
        while (i < s.length() && s.charAt(i) == ' ')
            i++;
        int sign = 1;
        if(i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')){
            sign = (s.charAt(i) == '-')? -1: 1; 
            i++;
        }
        
        StringBuilder Sb = new StringBuilder();
        while( i < s.length() && Character.isDigit(s.charAt(i))){
            Sb.append(s.charAt(i));
            i++;
        }
        if(Sb.length() > 0){ 
            
        int index = 0; 
        while(index < Sb.length() && Sb.charAt(index) == '0')
              index++;
        Sb.replace(0, index, "");
            
        
        if(Sb.length() > 10){
            if(sign == -1)
                return Integer.MIN_VALUE;
            else
                return Integer.MAX_VALUE;
        }
            
        if(Sb.length() > 0){      
        Long number = Long.parseLong(Sb.toString());
        if(sign == -1){
                if(number*-1 <= Integer.MIN_VALUE)
                    return Integer.MIN_VALUE;
                return Integer.parseInt(Sb.toString())*-1;
        }
        else{
            if(number >= Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            return Integer.parseInt(Sb.toString());
        }
        }
        }
        return 0; 
    }
}