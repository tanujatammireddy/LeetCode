class Solution {
    public int countSubstrings(String s) {
        
        int len = s.length();
        int count = 0;
        boolean[][] palindrom = new boolean[len][len];
        
        for(int i=0;i< len ;i++){
            palindrom[i][i] = true;
            count++;
        }
            
        
        for( int i=0 ;i< len-1;i++){
            int j =i+1;
            if(s.charAt(i) == s.charAt(j))
            {
                palindrom[i][j] = true;
                palindrom[j][i] = true;
                count++;
            }
        }
        
        for(int k= 2; k< len ;k++){
            for(int i= 0, j= i+ k; j<len;i++,j++){
                if(s.charAt(i) == s.charAt(j) && palindrom[i+1][j-1])
                {
                    palindrom[i][j] = true;
                    count++;
                }
            }
           
       }
        return count;
        
    }
}