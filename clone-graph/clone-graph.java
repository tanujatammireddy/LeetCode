/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
       
        Map<Integer,Node>visitedNodeMap = new HashMap();
        
        if(node != null){
            
            Queue<Node> queue = new LinkedList();
            queue.add(node);
            Node clone = new Node(node.val,new ArrayList());
            visitedNodeMap.put(node.val,clone);
            
            while(!queue.isEmpty()){
                
                Node current = queue.remove();
                
                for(Node neigh: current.neighbors){
                    if(!visitedNodeMap.containsKey(neigh.val)){
                        
                        visitedNodeMap.put(neigh.val,new Node(neigh.val,new ArrayList()));
                        queue.add(neigh);
                    }
                       visitedNodeMap.get(current.val).neighbors.add(visitedNodeMap.get(neigh.val));
                }
            }
            return visitedNodeMap.get(node.val);
        }
        
        return node;
        
        
    }
}