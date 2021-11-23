class Solution {
    public int numDecodings(String s) {
        
        if(s.charAt(0) == '0') return 0;
        
        int len = s.length();
        int[] dp = new int[len+1];
        dp[0] = 1;
        dp[1] = 1;
        
        for(int i= 2;i < len+1 ;i++ ){
            if(s.charAt(i-1) != '0')
                dp[i] = dp[i-1];
            
            int two_digit = Integer.parseInt(s.substring(i-2,i));
            if(two_digit >= 10 && two_digit<= 26)
                dp[i] += dp[i-2]; 
        }
        
        return dp[len];
            
        
    }
}