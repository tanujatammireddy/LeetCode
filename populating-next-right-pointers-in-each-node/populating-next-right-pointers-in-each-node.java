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
        
        Queue<Pair<Node,Integer>> queue = new LinkedList<>();
        if(root != null)
        queue.add(new Pair(root,0));
        int previousLevel = -1;
        Node previousNode = new Node();
        
        while(!queue.isEmpty()){
            
            Pair p = queue.poll();
            Node currentNode = (Node)p.getKey();
            int currentLevel = (Integer) p.getValue();
            
            if(previousLevel == currentLevel)
                currentNode.next = previousNode;
            if(currentNode.right != null)
                queue.add(new Pair(currentNode.right,currentLevel+1));
            if(currentNode.left != null)
                queue.add(new Pair(currentNode.left,currentLevel+1));
            
            previousNode = currentNode;
            previousLevel = currentLevel;
            
        }
        
        
        return root;
    }
}