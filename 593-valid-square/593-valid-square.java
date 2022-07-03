class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        
        
        if(isEqual(p1,p2)|| isEqual(p1,p3) || isEqual(p1,p4) || isEqual(p2,p3) ||isEqual(p2,p4) || isEqual(p3,p4))
            return false;
        
        Set<Integer> set = new HashSet();
            
        set.add(distance(p1,p2));
        set.add(distance(p1,p3));
        set.add(distance(p1,p4));
        set.add(distance(p3,p2));
        set.add(distance(p4,p2));
        set.add(distance(p4,p3));
        
        if(set.size() != 2){
            return false;
        }
        return true;
    }
    private int distance(int[] a, int[] b){
        
        return (int)(Math.pow((a[0]-b[0]),2) + Math.pow((a[1]-b[1]),2));
    }
    
    private boolean isEqual (int[]a, int[] b){
        return (a[0] == b[0])&&(a[1] == b[1]);
        
    }
}