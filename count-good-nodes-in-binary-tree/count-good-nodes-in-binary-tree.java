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
    public int count = 0;
    public int goodNodes(TreeNode root) {
        if(root != null)
            dfs(root,Integer.MIN_VALUE);
        
        return count;
            
    }
    public void dfs(TreeNode root, int max) {
        if( root.val >= max )
            count++;
        max = Math.max(root.val,max);
        if(root.left != null)
            dfs(root.left,max);
        if(root.right!=null)
            dfs(root.right,max);
        
    }
}