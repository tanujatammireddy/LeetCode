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
    Map<Node,Node> visited ;
    
    public Node cloneGraph(Node node) {
        
        visited = new HashMap();
        if(node != null)
            return clone(node);
        else
            return node;
        
    }
    public Node clone(Node node){
        
        if(!visited.containsKey(node)){
            
            Node cloned = new Node(node.val);
            visited.put(node,cloned);
            
            for(Node child: node.neighbors){
                cloned.neighbors.add(clone(child));
            }
        }
        
        return visited.get(node);
    }
}