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
    int max = 0;
    public int maxDepth(TreeNode root) {
        if(root != null)
        {
            depth(root,1);
        }
        return max;
    }
    
    public void depth(TreeNode root, int height){
        
        if(root.left == null && root.right == null){
            max = Math.max(height,max);
        }
        else{
            if(root.left != null)
                depth(root.left,height+1);
            if(root.right != null)
                depth(root.right,height+1);
        }
    }
}