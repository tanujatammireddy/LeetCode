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
    
    int idx ;
    List<Integer> list;
    int size;
    public BSTIterator(TreeNode root) {
        idx = 0;
        list = new ArrayList();
        traversal(root, list);
        size = list.size();
    }
    
    public int next() {
        return list.get(idx++);
    }
    
    private void traversal(TreeNode root, List<Integer> list){
        if(root.left != null)
            traversal(root.left, list);
        list.add(root.val);
        if(root.right != null)
            traversal(root.right, list);
    }
    
    public boolean hasNext() {
        if(idx < size)
            return true;
        else
            return false;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */