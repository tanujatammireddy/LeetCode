class Solution {
    public int compareVersion(String version1, String version2) {
        
        String[] version1_nodes = version1_nodes = version1.split("\\.");
        String[] version2_nodes = version2_nodes = version2.split("\\.");
        
        int index_max = Math.max(version1_nodes.length,version2_nodes.length);
        
        for(int i=0; i< index_max; i++ ){
            int v1 = (i < version1_nodes.length) ? Integer.parseInt(version1_nodes[i]) : 0;
            int v2 = (i < version2_nodes.length) ? Integer.parseInt(version2_nodes[i]) : 0;
            
            if(v1 != v2)
                return (v1 > v2) ? 1: -1;
        }
        
        return 0;
        
    }
}