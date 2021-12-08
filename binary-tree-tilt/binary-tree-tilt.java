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
    
    int sum ;
    public int findTilt(TreeNode root) {
        
        sum = 0;  
        tilt(root);
        return sum;
    }
    
    public int tilt(TreeNode root){
        
        if(root == null)
            return 0;
        
        int left = 0;
        int right = 0;
        left =tilt(root.left);
        right =tilt(root.right);
        
        sum += Math.abs(left-right);
        
        return root.val + left + right;
        
    }
}