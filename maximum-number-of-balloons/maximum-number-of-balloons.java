class Solution {
    public int maxNumberOfBalloons(String text) {
        // balloon b-1,a-1,n-1,l-2,o-2
        int count = 0;
        int b_count = 0;
        int a_count = 0;
        int n_count = 0;
        int l_count = 0;
        int o_count = 0;
        for(char ch:text.toCharArray()){
            
            if(ch == 'b') b_count++;
            if(ch == 'a') a_count++;
            if(ch == 'n') n_count++;
            if(ch == 'l') l_count++;
            if(ch == 'o') o_count++;
        }
        l_count = l_count/2;
        o_count = o_count/2;
        
        return Math.min(b_count, Math.min(a_count, Math.min(n_count, Math.min(l_count,o_count))));
        
    }
}