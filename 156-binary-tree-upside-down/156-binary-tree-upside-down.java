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
class Solution {
    public TreeNode upsideDownBinaryTree(TreeNode root) {
        if(root == null ||(root.left == null && root.right == null))
            return root;
        
        return helper(root,null);
        
    }
    
    public TreeNode helper(TreeNode child,TreeNode parent ){
        
        if(child == null)
            return parent;
        
        TreeNode left = helper(child.left,child);
        
        if (parent != null) {
            child.left = parent.right;
            parent.right = null;
            parent.left = null;
            child.right = parent;
        }
        
       return left;
        
    }
}