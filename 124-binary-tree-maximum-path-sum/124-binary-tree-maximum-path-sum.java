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
    
    int max_Sum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
       
        maxSum(root);
        return max_Sum;
        
        
    }
    
    public int maxSum(TreeNode root){
        
        if(root == null) return 0;
        
        int left = 0;
        int right = 0;
        left =  Math.max(maxSum(root.left),0);
        right = Math.max(maxSum(root.right),0);
        max_Sum = Math.max(left+right+root.val,max_Sum);
        return root.val + Math.max(left,right);
    }
}