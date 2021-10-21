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
        
        long num = 0;
        while( i < s.length() && Character.isDigit(s.charAt(i))){
            num = num *10 + Character.getNumericValue(s.charAt(i));
            if(num*sign <= Integer.MIN_VALUE)
                    return Integer.MIN_VALUE;
            if(num*sign >= Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            i++;
        }
        
        if(sign == -1)
                return (int)num*-1;
        else
            return (int)num;
         
    }
}
