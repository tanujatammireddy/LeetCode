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
        
        Node start = root;
        Queue<Pair<Node,Integer>> queue = new LinkedList();
        queue.add(new Pair(start,0));
        List<List<Node>> nodeList = new ArrayList();
        while(!queue.isEmpty()){
            Pair p = queue.poll();
            Node current = (Node) p.getKey();
            int currentLevel = (int) p.getValue();
            if(nodeList.size() == currentLevel){
                List<Node> subList = new ArrayList();
                subList.add(current);
                nodeList.add(subList);
            }
            else
            nodeList.get(currentLevel).add(current);
            
            if(current.left != null)
            queue.add(new Pair(current.left,currentLevel+1));
            if(current.right != null)
            queue.add(new Pair(current.right,currentLevel+1));
            
        }
        for(int i = 1; i< nodeList.size(); i++){
            List<Node> currentList = nodeList.get(i);
            int len = currentList.size();
            Node previous = currentList.get(len-1);
            for(int j = len-2; j>=0 ;j--){
                Node current = currentList.get(j);
                current.next = previous;
                previous = current;
            }
        }
        
    }
    return root;
    }
}