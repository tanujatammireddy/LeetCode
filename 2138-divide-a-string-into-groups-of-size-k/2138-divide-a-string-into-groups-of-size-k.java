class Solution {
    public String[] divideString(String s, int k, char fill) {
        
        int len = s.length();
        int n = 0;
        if(len%k == 0){
            n = len/k;
        }
        else
            n = len/k+1;
        StringBuilder[] sb = new StringBuilder[n];
        int idx = 0;
        int i= 0;
        
        while(i< len){
            
            int j= 0;
            sb[idx] = new StringBuilder(); 
            while(j< k && i< len){
                
                sb[idx].append(s.charAt(i));
                i++;
                j++;
            }
            if(i == len) 
                break;
            idx++;
        }
        
        while(sb[idx].length() < k){
            sb[idx].append(fill);
        }
        
        String[] result = new String[n];
        
        for(int id = 0; id< n;id++){
            result[id] = sb[id].toString();
        }
        
        return result;
        
    }
}