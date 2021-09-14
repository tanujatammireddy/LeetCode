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
    TreeNode result = new TreeNode();
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        
        if(root1 == null && root2 != null )
             return root2;
        if(root1 != null && root2 == null )
             return root1;
        if(root1 != null && root2 != null )
            return inorderTraversal(root1,root2);
        return null;
    }
    public TreeNode inorderTraversal(TreeNode root1, TreeNode root2) {
        
        TreeNode current = new TreeNode();
        
        if(root1 != null && root2 != null )
            current.val = root1.val + root2.val;
        
        if(root1.left != null && root2.left != null)
            current.left = inorderTraversal(root1.left,root2.left);
        else if(root1.left == null && root2.left != null)
            current.left = root2.left;
        else if(root1.left != null && root2.left == null)
            current.left = root1.left;
        
        if(root1.right != null && root2.right != null)
            current.right = inorderTraversal(root1.right,root2.right);
        else if(root1.right == null && root2.right != null)
            current.right = root2.right;
        else if(root1.right != null && root2.right == null)
            current.right = root1.right;
        
        return current;
    }
}