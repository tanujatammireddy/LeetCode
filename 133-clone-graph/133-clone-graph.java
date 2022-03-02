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
    
    Map<Node,Node> map;
    public Node cloneGraph(Node node) {
        map = new HashMap();
        if(node != null)
            return helper(node);
        else
            return node;
    }
    public Node helper(Node current){
        if(map.containsKey(current))
            return map.get(current);
        else
        {
            Node clone = new Node(current.val);
            map.put(current,clone);
            for(Node child: current.neighbors){
                clone.neighbors.add(helper(child));
            }
            
            return clone;
        }
    }
}