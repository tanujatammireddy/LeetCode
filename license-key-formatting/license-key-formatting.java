class Solution {
    public String licenseKeyFormatting(String s, int k) {
        
        StringBuilder sb = new StringBuilder(s.toUpperCase().replace("-",""));
        int index = sb.length();
        while(index-k > 0){
            
            sb.insert( index-k,"-");
            index = index-k;
            
        }

        return sb.toString();
        
        
    }
}