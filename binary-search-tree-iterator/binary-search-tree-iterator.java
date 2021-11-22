/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BSTIterator {
    List<Integer> list;
    int size = 0;
    int current = -1;
    public BSTIterator(TreeNode root) {
        
        list = new ArrayList();
        if(root != null){
            traversal(root);
        size = list.size();
        if(size >= 1)
            current = 0;
        }
    }
    
    public int next() {
        current++;
        return list.get(current-1);
    }
    
    public boolean hasNext() {
        if(current >=0 && current < size)
            return true;
        return false;
        
    }
    
    private void traversal(TreeNode root){
        if(root.left != null)
            traversal(root.left);
        list.add(root.val);
        if(root.right != null)
            traversal(root.right);
        
        
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */