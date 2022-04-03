class Solution {
    public int numWays(String s) {
        
        int onesCount = 0;
        int numWays = 0;
        long n = s.length();
        long mod = 1_000_000_007;
        for(char ch:s.toCharArray()){
            if(ch == '1')
               onesCount++; 
        }
        
        if(onesCount == 0)
            return (int)((((n-1)*(n-2))/2)%mod);
        
        else if(onesCount%3 == 0)
        {
            int perStringOneCount =  onesCount/3;
            int oneCount = 0; 
            long p1 = 0;
            long p2 = 0;
            for(char ch:s.toCharArray()){
                if(ch == '1')
                    oneCount++; 
                if(oneCount == perStringOneCount)
                    p1++;
                if(oneCount == 2*perStringOneCount)
                    p2++; 
            } 
            
            numWays = (int)((p1*p2)%mod);
            
        }
        return numWays;
        
    }
    
}