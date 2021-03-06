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
    int max = -1;
    public int maxDepth(TreeNode root) {
           return depth(root,0);
    }
    public int depth(TreeNode root,int depth) {
        
         if(root == null){
             max = Math.max(depth,max);
             return max;
         }
        
        return Math.max(depth(root.left,depth+1),depth(root.right,depth+1));
        
    }
}