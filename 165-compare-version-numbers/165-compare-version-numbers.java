class Solution {
    public int compareVersion(String version1, String version2) {
        
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        
        int len = Math.max(v1.length,v2.length);
        
        int len1 = v1.length;
        int len2 = v2.length;
        int idx1 = 0;
        int idx2 = 0;
        
        
        while(len > 0){
            
            
            int ver1 = (idx1 < len1) ? Integer.valueOf(v1[idx1]) :0;
            int ver2 = (idx2 < len2) ? Integer.valueOf(v2[idx2]) :0;
            len--;
            idx1++;
            idx2++;
            //System.out.println(ver1+" "+ver2);
            if(ver1 == ver2)
                continue;
            else if(ver1 < ver2)
                return -1;
            else
                return 1;
            
        }
        
        return 0;
        
        
        
    }
    
    
}