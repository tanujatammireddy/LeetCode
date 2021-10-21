/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> result = new ArrayList();
    
    public List<Integer> preorder(Node root) {
        dfs(root);
        return result;
    }
    
    public void dfs(Node root){
        
        if(root != null){
        result.add(root.val);    
        for(Node current:root.children)
            dfs(current);
        }
            
    }
}