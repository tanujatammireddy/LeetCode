class Solution {
    public int kEmptySlots(int[] bulb, int k) {
        
        int len = bulb.length;
        int day = 0;
        boolean valid = false;
        int[] daily = new int[len];
        
        for(int i= 0;i < len; i++){
            
            int pos = bulb[i] -1;
            daily[pos] = 1;
            day ++;
            
            valid = check_space(pos,k+pos+1,daily)|| check_space(pos-k-1,pos,daily);
            
            if(valid)
                return day;
        }
        
        
        return valid ? day :-1;
    }
        
    public boolean check_space(int start, int end,int[] daily){
        
        
        if(start >=0 && end < daily.length && daily[start] == 1 && daily[end] == 1){
            for(int i= start+1 ;i< end;i++){
                if(daily[i] == 1)
                    return false;
            }
            return true;
                
        }
           return false; 
        }
}