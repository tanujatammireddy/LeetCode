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
    int minDepth = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if(root != null){
            height(root, 0);
            return minDepth;
        }
         return 0;   
    }
    public void height(TreeNode root, int depth) {
        
        if(root.left == null && root.right == null){
           minDepth = Math.min(minDepth, depth+1); 
        }
        else {
            if(root.left != null)
                height(root.left, depth+1);
            if(root.right != null)
                height(root.right, depth+1);
        }
            
    }
}