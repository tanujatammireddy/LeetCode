class Solution {
    public int numDecodings(String s) {
        
        if(s.charAt(0) == '0')
            return 0;
        
        int len = s.length();
        int[] dp = new int[len+1];
        dp[0] = 1;
        dp[1] = 1;
        
        for(int i= 2; i<= len ;i++){
            
            //System.out.print(i);
            if(s.charAt(i-1) != '0')
                dp[i] = dp[i-1];
            
            //System.out.print(dp[i]);
            
            int twoDigit = Integer.parseInt(s.substring(i-2,i));
            if(twoDigit >= 10 && twoDigit <= 26) 
                dp[i] += dp[i-2];
        }
        
        return dp[len];
    }
}