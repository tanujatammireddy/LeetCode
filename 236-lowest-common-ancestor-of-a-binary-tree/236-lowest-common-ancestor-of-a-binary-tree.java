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
    
    TreeNode LCA;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        recursion(root,p,q);
        return LCA;
    }
    
    public boolean recursion(TreeNode node, TreeNode p, TreeNode q){
        
        if(node == null)
            return false;
        
        int left = recursion(node.left,p,q)? 1:0;
        int right = recursion(node.right,p,q)? 1:0;
        
        int mid  = ((node == p)||(node == q)) ? 1:0;
        
        if(mid + left + right >= 2)
            LCA = node;
        
        return (left + right + mid > 0); 
    }
}