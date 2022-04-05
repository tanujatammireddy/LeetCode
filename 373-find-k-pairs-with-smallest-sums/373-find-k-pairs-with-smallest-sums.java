class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        
        List<List<Integer>> result = new ArrayList();
        PriorityQueue<node> pq = new PriorityQueue();
        
        for(int i=0; i< nums1.length; i++){
            pq.add(new node(nums1[i], nums2[0],0));
        }
        
        while(k >0 && !pq.isEmpty() ){
            
            node current = pq.poll();
            
            int idx = current.pos;
            idx++;
            
            List<Integer> list = new ArrayList();
            list.add(current.a);
            list.add(current.b);
            result.add(list);
            
            if( idx < nums2.length)
                pq.add(new node(current.a, nums2[idx],idx));
            k--;
        }
        
        return result;
    }
    
    public class node implements Comparable<node>{
        int a;
        int b;
        int pos;
        
    public node(int x, int y, int id){
        a = x;
        b = y;
        pos = id;
    }
    @Override
    public int compareTo(node other){
        return (a+b)-(other.a+other.b); 
    }
    }
}