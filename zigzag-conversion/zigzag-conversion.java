class Solution {
    public String convert(String s, int numRows) {
        int index = 0;
        int len = s.length();
        StringBuilder[] pattern = new StringBuilder[numRows];
        
        for(int i=0 ;i< numRows; i++){
            pattern[i] = new StringBuilder();
        }
        
        int j = 0;
        while(index < len){
            
            j= 0;
            while(j< numRows && index < len){
                pattern[j].append(s.charAt(index));
                index++;
                j++;
            }
            
            j = numRows-2;
            while(j >= 1 && index < len){
                pattern[j].append(s.charAt(index));
                index++;
                j--;
            }
            
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0 ;i< numRows; i++){
            //System.out.println(pattern[i]);
            sb.append(pattern[i]);
        }
        
        return sb.toString();
    }
}