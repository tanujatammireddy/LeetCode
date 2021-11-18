class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
       
        //System.out.println();
        
        if(Arrays.equals(p1,p2) || Arrays.equals(p1,p3) || Arrays.equals(p1,p4) || Arrays.equals(p2,p3) ||  Arrays.equals(p2,p4) || Arrays.equals(p3,p4))
            return false;
        
        Set<Integer> set = new HashSet();
        set.add(distance(p1,p2));
        set.add(distance(p1,p3));
        set.add(distance(p1,p4));
        set.add(distance(p3,p2));
        set.add(distance(p4,p2));
        set.add(distance(p4,p3));
        
        return set.size() == 2;
    }
    
    public int distance(int[] a, int[] b){
        return (a[0]-b[0])*(a[0]-b[0]) + (a[1]-b[1])*(a[1]-b[1]);
    }
}