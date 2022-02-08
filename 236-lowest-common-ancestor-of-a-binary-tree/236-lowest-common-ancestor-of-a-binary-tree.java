/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private TreeNode LCA;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root != null)
            helper(root,p,q);
        
        return LCA;
    }
    
    public boolean helper(TreeNode node,TreeNode p, TreeNode q) {
        
        if(node == null)
            return false;
        
        int left = helper(node.left,p,q) ? 1:0;
        int right = helper(node.right,p,q) ? 1:0;
        
        int mid = (node == p) ||(node ==q) ? 1:0;
        
        if(left + right + mid >= 2)
            LCA = node;
        
        return (left + right + mid >0);
        
        
    }
}