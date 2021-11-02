/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        
        if(root != null){
        Queue<Pair<Node,Integer>> queue = new LinkedList();
        queue.add(new Pair(root,0));
        
        int previous_level = -1;
        Node previous_node = new Node();
        while(!queue.isEmpty()){
            
            Pair p = queue.poll();
            Node current = (Node) p.getKey();
            int level = (Integer) p.getValue();
            
            if(previous_level < level)
               previous_node = null; 
            
            current.next = previous_node;
            
            if(current.right != null)
                queue.add(new Pair(current.right,level+1));
            
            if(current.left != null)
                queue.add(new Pair(current.left,level+1));
            
            previous_level = level;
            previous_node = current;
        }
        }
        
        return root;
    }
}