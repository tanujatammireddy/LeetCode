class Solution {
    public String longestPalindrome(String s) {
        
        int len = s.length();
        int[][] table = new int[len][len];
        int maxLength = 1;
        
        for(int i=0;i< len;i++){
            table[i][i] = 1;
        }
        
        int start = 0;
        for(int i=0;i<len-1;i++){
            if(s.charAt(i)== s.charAt(i+1)){
                table[i][i+1] = 1;
                maxLength = 2;
                start = i;
            }
        }
        
        for(int k= 3; k<=len;k++){
            for(int i=0;i<len-k+1;i++){
                int j = i+k-1;
                if(table[i+1][j-1] == 1 && s.charAt(i)== s.charAt(j)){
                    table[i][j] = 1;
                if(k > maxLength){
                    maxLength = k;
                    start = i;
                }
                }
            }
        }
        
        return s.substring(start,start+maxLength);
    }
}