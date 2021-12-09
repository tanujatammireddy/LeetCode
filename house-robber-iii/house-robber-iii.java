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
    public int rob(TreeNode root) {
        
        int[] result = helper(root);
        
        return Math.max(result[0], result[1]);
        
    }
    
    public int[] helper(TreeNode root){
        
        if(root == null)
            return new int[]{0,0};
        int[] left = helper(root.left);
        int[] right = helper(root.right);
        
        int rob = root.val + left[1] + right[1];
        int notRob = Math.max(left[1],left[0]) + Math.max(right[0] ,right[1]);
            
        return new int[]{rob,notRob};
    }
    
    
}