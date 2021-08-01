class Solution {
    public String longestPalindrome(String s) {
        
        String returnString ="";
        if(s == null || s.length() < 1) return "";
        if(s.length()==1) return s;
        int len = s.length();
        boolean [][] memo = new boolean[len][len];
        
        for(int start =0; start <len; start++){
            int j = start;
            memo[start][j] = true;
            if(j+1 < len && s.charAt(start) == s.charAt(j+1)){
                j++;
               memo[start][j] = true;
            }
            if(memo[start][j] == true && j-start >= returnString.length())
                returnString = s.substring(start,j+1);
             
        }
        for(int k=3; k<=len; k++){
        for(int start =0; start <len; start++){
        int end = start + k -1;
            if(end < len){
               if(s.charAt(start)== s.charAt(end)){
                    if(start+1 < len && end -1 >=0 && memo[start+1][end-1] == true){
                            memo[start][end] = true;
                    }
                }
                if(memo[start][end] == true && end-start >= returnString.length()){
                            returnString = s.substring(start,end+1);
                } 
            }   
            }
            }
      /* for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                    System.out.print(" "+memo[i][j]);
                }
            System.out.println("");
         }*/
        return returnString;
        
    }
}